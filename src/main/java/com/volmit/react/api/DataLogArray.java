package com.volmit.react.api;

import java.io.File;
import java.io.IOException;

import com.volmit.react.Config;
import com.volmit.react.util.D;
import com.volmit.react.util.F;
import com.volmit.react.util.M;
import com.volmit.volume.lang.collections.GList;
import com.volmit.volume.lang.collections.GMap;

public class DataLogArray
{
	private Datalog log;
	private File folder;
	private int maxSize = 1728000;
	private int baseSize = 1200;
	private long tolerance = 240000;
	private boolean forceclose = false;
	private long last = M.ms() - 70000;

	public DataLogArray(File folder)
	{
		this.folder = folder;
		folder.mkdirs();
	}

	public long totalSize()
	{
		long v = 0;

		for(File i : getLogs().k())
		{
			v += i.length();
		}

		return v;
	}

	private int continuallyCondense() throws IOException
	{
		if(M.ms() - last < 60000)
		{
			return 0;
		}

		last = M.ms();

		int v = 0;

		while(condense())
		{
			v++;
		}

		return v;
	}

	private boolean condense() throws IOException
	{
		GMap<File, Long> f = getLogs();

		for(File i : f.k())
		{
			long start = f.get(i);
			long duration = getDuration(i);
			long end = start + duration;

			if(duration < 24 * 60 * 60 * 1000)
			{
				for(File j : f.k())
				{
					if(!j.equals(i))
					{
						long mstart = f.get(j);
						long mduration = getDuration(j);

						if(mstart > end && mstart - end < tolerance && mduration + duration < maxSize)
						{
							merge(i, j);
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	private void merge(File i, File j) throws IOException
	{
		Datalog r1 = new Datalog(i);
		Datalog r2 = new Datalog(j);
		r1.openReadStream();
		r2.openReadStream();
		long start = r1.getStart();
		int size = r1.getSize() + r2.getSize();
		File f = new File(i.getParentFile(), "sampledata-" + start + ".slg.lck");
		Datalog l = new Datalog(f);
		l.openStream(r1.getInterval(), r1.getItrf(), size, start);

		for(int k = 0; k < r1.getSize(); k++)
		{
			l.stream(r1.readStream());
		}

		for(int k = 0; k < r2.getSize(); k++)
		{
			l.stream(r2.readStream());
		}

		l.close();
		r1.closeRead();
		r2.closeRead();
		i.delete();
		j.delete();
		f.renameTo(i);
		D.v("Merged Datacache: " + j.getName() + " -> " + i.getName());
	}

	public long getDuration(File file) throws IOException
	{
		Datalog dl = new Datalog(file);
		dl.openReadStream();
		long ms = dl.getIntervalMS() * dl.getSize();
		dl.closeRead();

		return ms;
	}

	private void defrag() throws IOException
	{
		for(File i : folder.listFiles())
		{
			if(i.isFile() && i.getName().contains(".part.") && i.getName().startsWith("samplerdata-"))
			{
				long ms = Long.valueOf(i.getName().split("-")[1].split("\\.")[0]);
				int parts = Integer.valueOf(i.getName().split("\\.")[3]);
				File nf = new File(i.getParentFile(), "samplerdata-" + ms + ".slg");
				Datalog a = new Datalog(i);
				Datalog b = new Datalog(nf);
				a.openReadStream();
				b.openStream(a.getInterval(), a.getItrf(), parts, ms);

				for(int j = 0; j < parts; j++)
				{
					b.stream(a.readStream());
				}

				a.closeRead();
				b.close();
				a.getFile().delete();
				D.v("Repaired Datacache: " + i.getName());
			}
		}
	}

	private void trim()
	{
		while(totalSize() / 1024 / 1024 > Config.DLG_MAX_MB)
		{
			try
			{
				oldest().delete();
			}

			catch(Exception e)
			{
				break;
			}

			D.v("Trimming Datacache: " + F.fileSize(totalSize()));
		}
	}

	public File oldest()
	{
		long m = Long.MAX_VALUE;
		File ff = null;
		GMap<File, Long> l = getLogs();

		for(File i : l.k())
		{
			if(l.get(i) < m)
			{
				m = l.get(i);
				ff = i;
			}
		}

		return ff;
	}

	public GMap<SampledType, GList<Double>> pullLayers(long from, long to, int layers, SampledType... sv)
	{
		GMap<SampledType, GList<Double>> vv = new GMap<SampledType, GList<Double>>();
		GMap<Long, GList<Double>> m = pullLayers(from, to, layers);

		for(SampledType st : sv)
		{
			int a = st.ordinal();
			GList<Double> d = new GList<Double>();

			for(Long i : m.k().sortCopy().reverse())
			{
				d.add(m.get(i).get(a));
			}

			while(d.size() < layers)
			{
				if(!d.isEmpty())
				{
					d.add(d.get(d.size() - 1));
				}

				else
				{
					d.add(0D);
				}
			}

			vv.put(st, d);
		}

		return vv;
	}

	public GList<Double> pullLayers(long from, long to, int layers, SampledType st)
	{
		int a = st.ordinal();
		GMap<Long, GList<Double>> m = pullLayers(from, to, layers);
		GList<Double> d = new GList<Double>();

		for(Long i : m.k().sortCopy().reverse())
		{
			d.add(m.get(i).get(a));
		}

		while(d.size() < layers)
		{
			if(!d.isEmpty())
			{
				d.add(d.get(d.size() - 1));
			}

			else
			{
				d.add(0D);
			}
		}

		return d;
	}

	public GMap<Long, GList<Double>> pullLayers(long from, long to, int layers)
	{
		return pull(from, to, (int) (((to - from) / 50.0) / layers));
	}

	public GMap<Long, GList<Double>> pull(long from, long to, int interval)
	{
		GMap<Long, GList<Double>> dd = new GMap<Long, GList<Double>>();
		GMap<File, Long> all = getLogs();
		boolean skip = interval <= 1;
		int skipAmount = interval - 1;
		int skf = 0;

		for(File i : all.k())
		{
			if(all.get(i) < to)
			{
				Datalog d = new Datalog(i);

				try
				{
					d.openReadStream();

					while(d.hasNext())
					{
						if(skf > 0)
						{
							skf--;
							d.readStream();
						}

						GList<Double> dat = d.readStream();
						long effectiveTime = d.getStart() + (d.getRead() * 50);

						if(effectiveTime >= from && effectiveTime <= to)
						{
							dd.put(effectiveTime, dat);
						}

						if(skip)
						{
							skf = skipAmount;
						}
					}

					d.closeRead();
				}

				catch(IOException e)
				{
					e.printStackTrace();

					try
					{
						d.closeRead();
					}

					catch(IOException e1)
					{
						e1.printStackTrace();
					}

					continue;
				}
			}
		}

		return dd;
	}

	public GMap<File, Long> getLogs()
	{
		GMap<File, Long> logs = new GMap<File, Long>();

		for(File i : folder.listFiles())
		{
			if(i.isFile() && i.getName().endsWith(".slg"))
			{
				long date = Long.valueOf(i.getName().split("-")[1].split("\\.")[0]);
				logs.put(i, date);
			}
		}

		return logs;
	}

	public void beginNextStream() throws IOException
	{
		defrag();
		continuallyCondense();
		trim();
		cleanDeadlocks();
		cleanOldGrids();
		long time = M.ms();
		File f = new File(folder, "samplerdata-" + time + ".slg.lck");
		log = new Datalog(f);
		log.openStream(0, SampledType.values().length, baseSize);
	}

	private void cleanOldGrids() throws IOException
	{
		for(File i : getLogs().k())
		{
			try
			{
				Datalog dl = new Datalog(i);
				dl.openReadStream();

				if(dl.getItrf() != SampledType.values().length)
				{
					D.w(i.getName() + " out of sync with samplegrid. Deleting");
					dl.closeRead();
					i.delete();
				}

				else
				{
					dl.closeRead();
				}
			}

			catch(Exception e)
			{

			}
		}
	}

	private void cleanDeadlocks()
	{
		for(File i : folder.listFiles())
		{
			if(i.getName().endsWith(".slg.lck"))
			{
				i.delete();
			}
		}
	}

	public boolean forceClose() throws IOException
	{
		forceclose = true;

		if(log != null)
		{
			File f = log.getFile();
			int w = log.getWritten();
			File nf = new File(log.getFile().getParentFile(), log.getFile().getName().replace(".lck", ".part." + w));
			log.close();
			f.renameTo(nf);
		}

		return false;
	}

	public Datalog getLog()
	{
		return log;
	}

	public File getFolder()
	{
		return folder;
	}

	public void sample() throws IOException
	{
		if(forceclose)
		{
			return;
		}

		if(log == null)
		{
			beginNextStream();
		}

		if(log.remaining() == 0)
		{
			log.close();
			log.getFile().renameTo(new File(log.getFile().getParentFile(), log.getFile().getName().replace(".lck", "")));
			beginNextStream();
		}

		GList<Double> v = new GList<Double>();

		for(SampledType i : SampledType.values())
		{
			v.add(i.get().getValue());
		}

		log.stream(v);
	}
}
