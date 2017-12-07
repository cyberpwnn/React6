package react.graph;

import java.awt.image.AffineTransformOp;

import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;
import react.papyrus.ReactFont;
import surge.util.Anchor;

@Anchor(127)
public class GraphText extends NormalGraph implements IGraph
{
	private String text;
	private byte fontColor;
	private byte backgroundColor;

	public GraphText(String textInitial, byte fontColor)
	{
		super("textedGraph-" + textInitial, 1000);

		this.text = textInitial;
		this.fontColor = fontColor;
		this.backgroundColor = FrameColor.matchColor(FrameColor.getColor(fontColor).darker().darker().darker());
	}

	@Override
	public void onRender(BufferedFrame frame)
	{
		int x = (frame.getWidth() / 2);
		int y = (frame.getHeight() / 2);
		int w = ReactFont.Font.getWidth(text) + 6;
		int h = ReactFont.Font.getHeight() + 6;
		BufferedFrame presc = new BufferedFrame(w, h);
		presc.write(backgroundColor);
		presc.drawText(3, 3, ReactFont.Font, FrameColor.matchColor(0, 0, 0), text);
		presc.drawText(2, 2, ReactFont.Font, fontColor, text);
		presc = presc.scale(2, 2, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		presc = presc.scale(1.5, 1.5, AffineTransformOp.TYPE_BILINEAR);
		w = presc.getWidth();
		h = presc.getHeight();
		frame.write(backgroundColor);
		frame.write(presc, x - (w / 2), y - (h / 2));
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
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