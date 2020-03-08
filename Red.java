/**
 * Red filter
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Red extends Filter
{
	public static void main(String[] args)
	{
		Red s = new Red();
		BufferedImage img = s.readSource();
		img = s.replace(img);
		
		s.save(img, "Red");
	}
	
	@Override
	public int[] function(int[] nums)
	{
		nums[1] = 0;
		nums[2] = 0;
		return nums;
	}
}