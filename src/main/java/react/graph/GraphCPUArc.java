package react.graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.util.UUID;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;
import react.papyrus.ReactFont;
import surge.util.Anchor;
import surge.util.Platform;

@Anchor(127)
public class GraphCPUArc extends NormalGraph implements IGraph
{
	private byte fontColor;
	private byte backgroundColor;
	private double pct;
	private Average aax = new Average(20);
	private Average aay = new Average(40);
	private Average aaz = new Average(60);
	private long msx;

	public GraphCPUArc(byte fontColor)
	{
		super("cpuGraph-" + UUID.randomUUID(), 1000);
		msx = M.ms();
		sample();
		this.fontColor = fontColor;
		this.backgroundColor = FrameColor.matchColor(FrameColor.getColor(fontColor));
	}

	private void sample()
	{
		if(M.ms() - msx > 500)
		{
			pct = Platform.CPU.getCPULoad();
			msx = M.ms();
		}
	}

	@Override
	public void onRender(BufferedFrame frame)
	{
		sample();
		aax.put(pct);
		aay.put(aax.getAverage());
		aaz.put(aay.getAverage());
		frame.write(FrameColor.matchColor(Color.black));
		BufferedImage img = frame.toBufferedImage();
		Graphics2D gg = img.createGraphics();

		Arc2D arc1 = new Arc2D.Double(4, 4, frame.getWidth() - 8, frame.getHeight() - 8, 0, (aax.getAverage() * 360.0), Arc2D.OPEN);
		Arc2D arc2 = new Arc2D.Double(8, 8, frame.getWidth() - 16, frame.getHeight() - 16, 0, (aay.getAverage() * 360.0), Arc2D.OPEN);
		Arc2D arc3 = new Arc2D.Double(12, 12, frame.getWidth() - 24, frame.getHeight() - 24, 0, (aaz.getAverage() * 360.0), Arc2D.OPEN);

		gg.setColor(Color.getHSBColor((float) aax.getAverage(), 1f, 1f));
		gg.setStroke(new BasicStroke(3));
		gg.draw(arc1);
		gg.setColor(Color.getHSBColor((float) aay.getAverage(), 1f, 1f).darker());
		gg.setStroke(new BasicStroke(2));
		gg.draw(arc2);
		gg.setColor(Color.getHSBColor((float) aaz.getAverage(), 1f, 1f).darker().darker());
		gg.setStroke(new BasicStroke(1));
		gg.draw(arc3);
		BufferedFrame fr = new BufferedFrame(frame.getWidth(), frame.getHeight());

		fr.fromBufferedImage(img);
		fr.drawText((fr.getWidth() / 2) - (ReactFont.Font.getWidth("CPU") / 2), (fr.getHeight() / 2) - (ReactFont.Font.getHeight() + 4), ReactFont.Font, FrameColor.matchColor(Color.getHSBColor((float) aax.getAverage(), 1f, 1f)), "CPU");
		fr.drawText((fr.getWidth() / 2) - (ReactFont.Font.getWidth(F.pc(aax.getAverage())) / 2), fr.getHeight() / 2, ReactFont.Font, FrameColor.matchColor(Color.getHSBColor((float) aax.getAverage(), 1f, 1f)), F.pc(aax.getAverage()));
		frame.write(fr);

		for(int i = 0; i < frame.getWidth(); i++)
		{
			for(int j = 0; j < frame.getHeight(); j++)
			{
				if((i == 0 || j == 0) || (i == frame.getWidth() - 1 || j == frame.getHeight() - 1))
				{
					frame.write(i, j, FrameColor.DARK_GRAY);
				}
			}
		}
	}

	public byte getFontColor()
	{
		return fontColor;
	}

	public void setFontColor(byte fontColor)
	{
		this.fontColor = fontColor;
	}

	public byte getBackgroundColor()
	{
		return backgroundColor;
	}

	public void setBackgroundColor(byte backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}
}
