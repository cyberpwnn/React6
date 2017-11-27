package react.papyrus;

import java.awt.Color;

import org.bukkit.map.MapFont;
import org.bukkit.map.MapFont.CharacterSprite;
import org.cyberpwn.gmath.M;

public class BufferedFrame
{
	private byte[][] frame;
	private int width;
	private int height;

	public BufferedFrame()
	{
		this(128, 128);
	}

	public BufferedFrame(int w, int h)
	{
		width = w;
		height = h;
		frame = new byte[w][h];
		write(FrameColor.TRANSPARENT);
	}

	public void drawText(int x, int y, MapFont font, byte ccc, String text)
	{
		int xStart = x;
		byte color = ccc;
		if(!font.isValid(text))
		{
			throw new IllegalArgumentException("text contains invalid characters");
		}

		for(int i = 0; i < text.length(); ++i)
		{
			char ch = text.charAt(i);

			if(ch == '\n')
			{
				x = xStart;
				y += font.getHeight() + 1;
				continue;
			}

			else if(ch == '\u00A7')
			{
				int j = text.indexOf(';', i);
				if(j >= 0)
				{
					try
					{
						color = Byte.parseByte(text.substring(i + 1, j));
						i = j;
						continue;
					}
					catch(NumberFormatException ex)
					{
					}
				}
			}

			CharacterSprite sprite = font.getChar(text.charAt(i));

			for(int r = 0; r < font.getHeight(); ++r)
			{
				for(int c = 0; c < sprite.getWidth(); ++c)
				{
					if(sprite.get(r, c))
					{
						write(x + c, y + r, color);
					}
				}
			}

			x += sprite.getWidth() + 1;
		}
	}

	public void write(byte c)
	{
		int i;
		int j;

		for(i = 0; i < width; i++)
		{
			for(j = 0; j < height; j++)
			{
				write(i, j, c);
			}
		}
	}

	public void writeRainbowMul()
	{
		int i;
		int j;

		for(i = 0; i < width; i++)
		{
			for(j = 0; j < height; j++)
			{
				write(i, j, FrameColor.matchColor(Color.getHSBColor((float) (i * j) / (float) (width * height), 1.0f, 1.0f)));
			}
		}
	}

	public void writeRainbowAdd()
	{
		int i;
		int j;

		for(i = 0; i < width; i++)
		{
			for(j = 0; j < height; j++)
			{
				write(i, j, FrameColor.matchColor(Color.getHSBColor((float) (i + j) / (float) (width + height), 1.0f, 1f)));
			}
		}
	}

	public void write(int x, int y, byte c)
	{
		frame[(int) M.clip(x, 0, width - 1)][(int) M.clip(y, 0, height - 1)] = c;
	}

	public void write(BufferedFrame frame, int sx, int sy)
	{
		byte[][] pframe = frame.getRawFrame();

		int i;
		int j;

		for(i = 0; i < M.min(frame.getWidth(), getWidth()); i++)
		{
			for(j = 0; j < M.min(frame.getHeight(), getHeight()); j++)
			{
				if(pframe[i][j] == 0)
				{
					continue;
				}

				write(i + sx, j + sy, pframe[i][j]);
			}
		}
	}

	public void write(BufferedFrame frame)
	{
		byte[][] pframe = frame.getRawFrame();

		int i;
		int j;

		for(i = 0; i < M.min(frame.getWidth(), getWidth()); i++)
		{
			for(j = 0; j < M.min(frame.getHeight(), getHeight()); j++)
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

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}
}
