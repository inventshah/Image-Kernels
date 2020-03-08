
/**
 * Abstract filter for Kernel and Math functions
 * 
 * Sachin Shah
 */

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class Filter
{
	private int[] matrix;
	private int unit;
	
	public Filter()
	{
		this.matrix = null;
		this.unit = 0;
	}
	
	public Filter(int[] m, int u)
	{
		this.matrix = m;
		this.unit = u;
	}
	
	public BufferedImage method(BufferedImage img, int u)
	{
		int size = u + u + 1;
		int unit = u;
		BufferedImage result = new BufferedImage(img.getWidth() - size - 1, img.getHeight() - size - 1, BufferedImage.TYPE_INT_RGB);
	 
		int[][] nums = new int[3][size * size];
		int count = 0;
		for (int i = unit; i < img.getHeight() - unit; i++)
		{
			for (int j = unit; j < img.getWidth() - unit; j++)
			{
				for( int s = -unit; s <= unit; s++)
				{
					for (int k = -unit; k <= unit; k++)
					{
						nums[0][count] = Convert.red(img.getRGB(j + k, i + s));
						nums[1][count] = Convert.green(img.getRGB(j + k, i + s));
						nums[2][count] = Convert.blue(img.getRGB(j + k, i + s));
						count++;
					}
				}

				if (j - unit < result.getWidth() && i - unit < result.getHeight())
				{
					result.setRGB(j - unit, i - unit, new Color(average(nums[0]), average(nums[1]), average(nums[2]), 1).getRGB());
				}

				count = 0;
			}
		}

		return result;
	}
	
	public BufferedImage method(BufferedImage img)
	{
		int size = this.unit + this.unit + 1;

		BufferedImage result = new BufferedImage(img.getWidth() - size - 1, img.getHeight() - size - 1, BufferedImage.TYPE_INT_RGB);
	 
		int[][] nums = new int[3][size * size];
		int count = 0;

		for (int i = unit; i < img.getHeight() - unit; i++)
		{
			for (int j = unit; j < img.getWidth() - unit; j++)
			{
				for(int s = -unit; s <= unit; s++)
				{
					for (int k = -unit; k <= unit; k++)
					{
						nums[0][count] = Convert.red(img.getRGB(j + k, i + s));
						nums[1][count] = Convert.green(img.getRGB(j + k, i + s));
						nums[2][count] = Convert.blue(img.getRGB(j + k, i + s));
						count++;
					}
				}

				if (j - unit < result.getWidth() && i - unit < result.getHeight())
				{
					result.setRGB(j - unit, i - unit, new Color(average(nums[0]), average(nums[1]), average(nums[2]), 1).getRGB());
				}

				count = 0;
			}
		}

		return result;
	}
	
	public BufferedImage replace(BufferedImage img)
	{
		BufferedImage result = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_RGB);
	 
		int[] nums = new int[3];
		for (int i = 0; i < img.getHeight(); i++)
		{
			for (int j = 0; j < img.getWidth(); j++)
			{
				nums[0] = Convert.red(img.getRGB(j, i));
				nums[1] = Convert.green(img.getRGB(j, i));
				nums[2] = Convert.blue(img.getRGB(j, i));

				nums = function(nums);

				result.setRGB(j, i, new Color(nums[0], nums[1], nums[2], 1).getRGB());
			}
		}
		return result;
	}
	
	public int average(int[] nums)
	{
		int count = 0;
		int sum = 0;
		int total = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			sum += nums[i] * matrix[i];
			total += matrix[i];
		}

		if (total == 0) total++;

		return range(sum / total);
	}
	
	public int[] function(int[] nums)
	{
		return nums;
	}
	
	public int range(int n)
	{
		if (n < 0)
		{
			return 0;
		}
		else if (n > 255)
		{
			return 255;
		}

		return n;
	}
	
	
	public void save(BufferedImage pic, String name)
	{
		try
		{
			ImageIO.write(pic, "png", new File("output/" + name + ".png"));
		}
		catch (Exception e)
		{
			System.out.println("unable to save image");
		}
	}
	
	public BufferedImage readSource()
	{
		return Convert.readSource();
	}

	public BufferedImage read(String s)
	{
		return Convert.readImage(s);
	}
}
