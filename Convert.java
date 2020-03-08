/**
 * General utility functions
 *
 * Sachin Shah
 */

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Convert
{
	public static BufferedImage readSource()
	{
		try
		{
			File file = new File("Source.png");
			return (BufferedImage) ImageIO.read(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return null;
	}
    
	public static BufferedImage readImage(String name){
		try
		{
			File file = new File(name);
			return (BufferedImage) ImageIO.read(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	public static int red(int colorInt)
	{
		return (colorInt >> 16) & 0xff;
	}
	public static int green(int colorInt)
	{
		return (colorInt >>  8) & 0xff;
	}
	public static int blue(int colorInt)
	{
		return (colorInt	  ) & 0xff;
	}
}
