package react.security;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

import react.controller.SecurityController;
import surge.Main;
import surge.Surge;
import surge.util.Anchor;

@Anchor(-8)
public class SecurityCheckpointCharlie
{
	public static void finishScan()
	{
		for(Class<?> i : Main.anchors.get(-7))
		{
			try
			{
				i.getConstructor().newInstance();
			}

			catch(InstantiationException e)
			{

			}

			catch(IllegalAccessException e)
			{

			}

			catch(IllegalArgumentException e)
			{

			}

			catch(InvocationTargetException e)
			{

			}

			catch(NoSuchMethodException e)
			{

			}

			catch(SecurityException e)
			{

			}
		}
	}

	public static void doScan(Runnable r)
	{
		new A()
		{
			@Override
			public void run()
			{
				try
				{
					Thread.sleep(500);
					GMap<String, ByteBuffer> hashes = new GMap<String, ByteBuffer>();
					GMap<String, ByteBuffer> currentHashes = new GMap<String, ByteBuffer>();
					currentHashes = scan(Surge.getPluginJarFile());
					ByteArrayInputStream bin = new ByteArrayInputStream(readResource(Surge.getPluginJarFile(), "fingerprint.dhs"));
					DataInputStream din = new DataInputStream(bin);
					int r = din.readInt();

					for(int i = 0; i < r; i++)
					{
						String key = din.readUTF();
						byte[] buf = new byte[32];
						din.readFully(buf);
						hashes.put(key, ByteBuffer.wrap(buf));
					}

					din.close();
					GSet<String> m = new GSet<String>();
					m.addAll(currentHashes.keySet());
					m.addAll(hashes.keySet());
					Iterator<String> wtf = m.iterator();

					while(wtf.hasNext())
					{
						String i = wtf.next();

						if(hashes.containsKey(i) && currentHashes.containsKey(i))
						{
							if(!Arrays.equals(hashes.get(i).array(), currentHashes.get(i).array()))
							{
								if(!SecurityController.failures.contains(i))
								{
									SecurityController.failures.add(i);
								}
							}
						}

						Thread.sleep(5);
					}
				}

				catch(Throwable e)
				{
					SecurityController.failures.add("%exception");
				}

				new S()
				{
					@Override
					public void run()
					{
						r.run();
						finishScan();
					}
				};
			}
		};
	}

	private static byte[] readResource(File f, String resource) throws IOException
	{
		String target = resource;
		File jar = f;
		ZipFile zipFile = new ZipFile(jar);
		Enumeration<? extends ZipEntry> entries = zipFile.entries();

		while(entries.hasMoreElements())
		{
			ZipEntry entry = entries.nextElement();

			if(entry.getName().equals(target))
			{
				byte[] buff = new byte[8192];
				InputStream stream = zipFile.getInputStream(entry);
				ByteArrayOutputStream boas = new ByteArrayOutputStream();
				int read = 0;

				while((read = stream.read(buff)) != -1)
				{
					boas.write(buff, 0, read);
				}

				stream.close();

				return boas.toByteArray();
			}
		}

		zipFile.close();

		return null;
	}

	public static GMap<String, ByteBuffer> scan(File f) throws IOException, NoSuchAlgorithmException
	{
		File i = f;
		GMap<String, ByteBuffer> keys = new GMap<String, ByteBuffer>();

		if(!i.isFile() || !i.getName().endsWith(".jar"))
		{
			return keys;
		}

		File jar = i;
		FileInputStream fin = new FileInputStream(jar);
		ZipInputStream zip = new ZipInputStream(fin);
		MessageDigest md = MessageDigest.getInstance("SHA-256");

		for(ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry())
		{
			if(!entry.isDirectory() && entry.getName().endsWith(".class"))
			{
				if(entry.getName().contains("$"))
				{
					continue;
				}

				String clazz = entry.getName().replaceAll("/", ".").replace(".class", "");
				byte[] data = readResource(i, entry.getName());
				byte[] digest = md.digest(data);
				keys.put(clazz, ByteBuffer.wrap(digest));
			}
		}

		zip.close();

		return keys;
	}
}
