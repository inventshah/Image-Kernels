/**
 * Min pooling
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Min extends Filter
{
	public static void main(String[] args)
	{
		Min s = new Min();
		BufferedImage img = s.readSource();
		img = s.method(img, 1);

		s.save(img, "Min");
	}
	
	@Override
	public int average(int[] nums)
	{
		int min = nums[0];
		for (int i : nums)
		{
			if (i < min)
			{
				min = i;
			}
		}

		return min;
	}
}