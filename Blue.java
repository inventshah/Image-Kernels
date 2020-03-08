/**
 * Blue only filter
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Blue extends Filter
{
	public static void main(String[] args)
	{
		Blue s = new Blue();
		BufferedImage img = s.readSource();
		img = s.replace(img);

		s.save(img, "Blue");
	}
	
	@Override
	public int[] function(int[] nums)
	{
		nums[1] = 0;
		nums[0] = 0;
		return nums;
	}
}