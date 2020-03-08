/**
 * Max pooling
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Max extends Filter
{
	public static void main(String[] args)
	{
		Max s = new Max();
		BufferedImage img = s.readSource();
		img = s.method(img, 1);

		s.save(img, "Max");
	}
	
	@Override
	public int average(int[] nums)
	{
		int max = nums[0];
		for (int i : nums)
		{
			if (i > max)
			{
				max = i;
			}
		}

		return (max);
	}
}