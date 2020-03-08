
/**
 * Emboss Kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Emboss extends Filter
{
	public Emboss()
	{
		super(new int[] {-2, -1, 0,
						 -1,  1, 1,
						  0,  1, 2},
						  1);
	}

	public static void main(String[] args)
	{
		Emboss s = new Emboss();
		BufferedImage img = s.readSource();
		img = s.method(img);
		
		s.save(img, "Emboss");
	}
}