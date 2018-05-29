package com.volmit.react.api;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.volmit.react.React;
import com.volmit.react.ReactPlugin;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.M;

public class Whiteboard
{
	private int x;
	private int y;
	private BufferedImage im;
	private long start;
	private long end;
	private GList<SampledType> ss;
	private GMap<SampledType, Color> ssv;
	private GMap<SampledType, Double> lmax;
	private double progress;
	private double total;
	private double comp;

	public Whiteboard(int x, int y, long start, long end, SampledType... sv)
	{
		lmax = new GMap<SampledType, Double>();
		this.x = x;
		this.y = y;
		im = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
		this.start = start;
		this.end = end;
		ss = new GList<SampledType>(sv);
		ssv = new GMap<SampledType, Color>();
		progress = 0;
		total = 0;
		comp = 0;

		for(int i = 0; i < ss.size(); i++)
		{
			float h = (float) i / (float) ss.size();
			ssv.put(ss.get(i), Color.getHSBColor(h, 1, 1).brighter());
		}

		fullRender();
	}

	public File save() throws IOException
	{
		File f = new File(new File(ReactPlugin.i.getDataFolder(), "cache"), "graph-" + M.ms() + ".png");
		ImageIO.write(im, "PNG", f);
		return f;
	}

	private void fullRender()
	{
		Graphics2D g = (Graphics2D) im.getGraphics();
		fullRender(g);
	}

	private void fullRender(Graphics2D g)
	{
		total += ss.size();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, x, y);

		for(SampledType i : ss)
		{
			drawSamples(g, i);
		}

		drawSampleHeading(g);
		drawSampleHeadingMax(g);
	}

	public void drawSampleHeading(Graphics2D g)
	{
		int cursorYa = y - 30;
		int cursorXa = 25;
		int cursorYb = y - 60;
		int cursorXb = 25;

		boolean tb = false;

		for(SampledType i : ss)
		{
			int cursorX = tb ? cursorXa : cursorXb;
			int cursorY = tb ? cursorYa : cursorYb;
			tb = !tb;
			Color c = ssv.get(i);
			g.setColor(c);
			g.fillRect(cursorX, cursorY, 25, 25);
			cursorX += 35;
			cursorY += 20;
			g.setColor(Color.white);
			g.drawString(i.get().getName(), cursorX, cursorY);
			cursorY -= 20;
			cursorX += (i.get().getName().length() * 7) + 15;

			if(tb)
			{
				cursorXa = cursorX;
				cursorYa = cursorY;
			}

			else
			{
				cursorXb = cursorX;
				cursorYb = cursorY;
			}
			comp++;
		}
	}

	public void drawSampleHeadingMax(Graphics2D g)
	{
		int cursorY = 15;
		int cursorX = 25;

		for(SampledType i : ss)
		{
			Color c = ssv.get(i);
			g.setColor(c);
			g.fillRect(cursorX, cursorY, 25, 25);
			cursorX += 35;
			cursorY += 20;
			g.setColor(Color.white);
			g.drawString(i.get().getFormatter().from(lmax.get(i)), cursorX, cursorY);
			cursorY -= 20;
			cursorX += (i.get().getFormatter().from(lmax.get(i)).length() * 7) + 15;
			comp++;
		}
	}

	public void drawSamples(Graphics2D g, SampledType s)
	{
		GList<Double> gg = React.instance.dataLogController.getDla().pullLayers(start, end, x, s);
		int last = -111;
		double max = 0;

		for(int i = 0; i < x; i++)
		{
			if(gg.get(i) > max)
			{
				max = gg.get(i);
			}
		}

		lmax.put(s, max);
		max += max / 6.5;
		for(int i = 0; i < x; i++)
		{
			double vv = gg.get(i) < 0 ? 0 : gg.get(i);
			double px = (1.0 - ((vv / max)));
			int lvl = (int) (px * y) - (y / 16);
			lvl = Double.isNaN(px) ? 0 : lvl;
			lvl = lvl < 0 ? 0 : lvl;
			lvl = lvl > y - 1 ? y - 1 : lvl;
			last = last == -111 ? lvl : last;
			g.setColor(ssv.get(s));
			g.setStroke(new BasicStroke(1.6f));
			g.drawLine(i == 0 ? i : i - 1, last, i, lvl);
			last = lvl;
		}

		comp++;
		System.out.println("Graphing: " + F.pc(getProgress()));
	}

	public void displayToFrame()
	{
		JFrame f = new JFrame("Whiteboard");
		f.setSize(x, y);
		JPanel p = new JPanel()
		{
			private static final long serialVersionUID = -7692494651923696516L;

			@Override
			public void paint(Graphics g)
			{
				super.paint(g);
				fullRender((Graphics2D) g);
			}
		};

		p.setSize(x, y);
		f.add(p);
		f.setVisible(true);
		f.setPreferredSize(new Dimension(x, y));
		p.setPreferredSize(new Dimension(x, y));
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public BufferedImage getIm()
	{
		return im;
	}

	public long getStart()
	{
		return start;
	}

	public long getEnd()
	{
		return end;
	}

	public GList<SampledType> getSs()
	{
		return ss;
	}

	public GMap<SampledType, Color> getSsv()
	{
		return ssv;
	}

	public GMap<SampledType, Double> getLmax()
	{
		return lmax;
	}

	public double getProgress()
	{
		progress = getComp() / (getTotal() + 1);
		return progress;
	}

	public double getTotal()
	{
		return total;
	}

	public double getComp()
	{
		return comp;
	}
}
