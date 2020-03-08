/**
 * Box blur filter
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Box extends Filter
{
	public static void main(String[] args)
	{
		Box s = new Box();
		BufferedImage img = s.readSource();

		img = s.method(img, 1);

		s.save(img, "Box");
	}
	
	@Override
	public int average(int[] nums)
	{
		int sum = 0;
		for (int i : nums)
		{
			sum += i;
		}

		return sum / nums.length;
	}
}
