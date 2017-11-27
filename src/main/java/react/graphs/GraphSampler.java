package react.graphs;

import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.api.ISampler;
import react.graph.IFormatter;
import react.graph.IGraph;
import react.graph.NormalGraph;
import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;
import react.papyrus.ReactFont;
import surge.util.Anchor;

@Anchor(127)
public class GraphSampler extends NormalGraph implements IGraph
{
	private double lx;
	private double ly;
	private ISampler sampler;
	private IFormatter formatter;
	private byte graphColor;
	private byte backgroundColor;
	private byte borderColor;
	private byte textColor;

	public GraphSampler(ISampler sampler, IFormatter formatter, long timeViewport)
	{
		super(sampler.getName(), timeViewport);
		this.sampler = sampler;
		this.formatter = formatter;
		graphColor = FrameColor.RED;
		backgroundColor = FrameColor.matchColor(0, 0, 0);
		textColor = FrameColor.WHITE;
		borderColor = FrameColor.DARK_GRAY;
		lx = 0;
		ly = 0;
	}

	public void sample()
	{
		getPlotBoard().plot(M.ms(), sampler.getValue());
	}

	@Override
	public void onRender(BufferedFrame frame, MapCanvas c, MapView view)
	{
		GMap<Long, Double> map = getPlotBoard().getBetween(M.ms() - getTimeViewport(), M.ms());
		GList<Long> da = map.k();
		da.sort();
		scaleFor(map.v());
		Average aa = new Average(2);
		int dlast = -1;
		int wlast = -1;
		double yv = 0;
		double xv = 0;
		frame.write(backgroundColor);

		for(int i = 0; i < 12; i++)
		{
			aa.put(da.get(0));
		}

		for(int i = 0; i < da.size(); i++)
		{
			double val = map.get(da.get(i));
			double pct = M.clip(1.0 - (val / getMax()), 0, 1);
			aa.put(pct);
			double scf = (double) frame.getWidth() / (double) da.size();
			int d = (int) (M.clip(aa.getAverage(), 0, 1.0) * (frame.getHeight() - 1));
			int w = (int) ((double) i * scf);
			d = (int) M.clip(d, 2, frame.getHeight() - 2);
			xv = w;
			yv = d;
			frame.write(w, d, graphColor);

			if(wlast >= 0)
			{
				if(wlast > w)
				{
					for(int j = wlast; j > w; j--)
					{
						frame.write(j, d, graphColor);
					}
				}

				if(wlast < w)
				{
					for(int j = w; j > wlast; j--)
					{
						frame.write(j, d, graphColor);
					}
				}
			}

			if(dlast >= 0)
			{
				if(dlast > d)
				{
					for(int j = dlast; j > d; j--)
					{
						frame.write((int) ((double) i * scf), j, graphColor);
					}
				}

				if(dlast < d)
				{
					for(int j = d; j > dlast; j--)
					{
						frame.write((int) ((double) i * scf), j, graphColor);
					}
				}
			}

			dlast = d;
			wlast = (int) ((double) i * scf);
		}

		if(Math.abs(xv - lx) > 0.01)
		{
			if(lx > xv)
			{
				lx -= ((double) Math.abs(xv - lx) / 10.0);
			}

			if(lx < xv)
			{
				lx += ((double) Math.abs(xv - lx) / 10.0);
			}
		}

		if(Math.abs(yv - ly) > 0.01)
		{
			if(ly > yv)
			{
				ly -= ((double) Math.abs(yv - ly) / 10.0);
			}

			if(ly < yv)
			{
				ly += ((double) Math.abs(yv - ly) / 10.0);
			}
		}

		frame.drawText(3, 3, ReactFont.Font, textColor, formatter.from(getMax()));
		frame.drawText(3, frame.getHeight() - 10, ReactFont.Font, textColor, formatter.from(0));

		for(int i = 0; i < frame.getWidth(); i++)
		{
			for(int j = 0; j < frame.getHeight(); j++)
			{
				if((i == 0 || j == 0) || (i == frame.getWidth() - 1 || j == frame.getHeight() - 1))
				{
					frame.write(i, j, borderColor);
				}
			}
		}
	}

	public void scaleFor(GList<Double> nums)
	{
		double max = Double.MIN_VALUE;

		for(double i : nums)
		{
			if(i > max)
			{
				max = i;
			}
		}

		if(max < 0)
		{
			setMax(1.0);
			return;
		}

		if(Math.abs(getMax() - max) > 0.01)
		{
			double dist = Math.abs(getMax() - max);
			double move = dist / 5;
			setMax(getMax() > max ? getMax() - move : getMax() + move);
		}
	}

	public IFormatter getFormatter()
	{
		return formatter;
	}

	public void setFormatter(IFormatter formatter)
	{
		this.formatter = formatter;
	}

	public byte getGraphColor()
	{
		return graphColor;
	}

	public void setGraphColor(byte graphColor)
	{
		this.graphColor = graphColor;
	}

	public byte getBackgroundColor()
	{
		return backgroundColor;
	}

	public void setBackgroundColor(byte backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}

	public byte getBorderColor()
	{
		return borderColor;
	}

	public void setBorderColor(byte borderColor)
	{
		this.borderColor = borderColor;
	}

	public byte getTextColor()
	{
		return textColor;
	}

	public void setTextColor(byte textColor)
	{
		this.textColor = textColor;
	}

	public ISampler getSampler()
	{
		return sampler;
	}
}
