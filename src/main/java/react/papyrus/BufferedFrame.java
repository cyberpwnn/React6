package react.papyrus;

public class BufferedFrame
{
	private byte[][] frame;

	public BufferedFrame()
	{
		frame = new byte[128][128];
		write(FrameColor.TRANSPARENT);
	}

	public void write(byte c)
	{
		int i;
		int j;

		for(i = 0; i < 128; i++)
		{
			for(j = 0; j < 128; j++)
			{
				write(i, j, c);
			}
		}
	}

	public void write(int x, int y, byte c)
	{
		frame[x][y] = c;
	}

	public void write(BufferedFrame frame)
	{
		byte[][] pframe = frame.getRawFrame();

		int i;
		int j;

		for(i = 0; i < 128; i++)
		{
			for(j = 0; j < 128; j++)
			{
				if(pframe[i][j] == 0)
				{
					continue;
				}

				write(i, j, pframe[i][j]);
			}
		}
	}

	public byte[][] getRawFrame()
	{
		return frame;
	}

}
