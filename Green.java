
/**
 * Green filter
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Green extends Filter
{
	public static void main(String[] args)
	{
		Green s = new Green();
		BufferedImage img = s.readSource();
		img = s.replace(img);
		
		s.save(img, "Green");
	}
	
	@Override
	public int[] function(int[] nums)
	{
		nums[0] = 0;
		nums[2] = 0;
		return nums;
	}
}