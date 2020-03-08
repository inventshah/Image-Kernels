
/**
 * Inverse 255 scale colors
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Inverse extends Filter
{
	public static void main(String[] args)
	{
		Inverse s = new Inverse();
		BufferedImage img = s.readSource();
		img = s.replace(img);

		s.save(img, "Inverse");
	}
	
	@Override
	public int[] function(int[] nums)
	{
		nums[0] = 255 - nums[0];
		nums[1] = 255 - nums[1];
		nums[2] = 255 - nums[2];
		return nums;
	}
}