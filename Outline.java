/**
 * Outline kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Outline extends Filter
{
	public Outline()
	{
		super(new int[] {-1, -1, -1,
						 -1,  8, -1,
						 -1, -1, -1}, 1);
	}

	public static void main(String[] args)
	{
		Outline s = new Outline();
		BufferedImage img = s.readSource();
		img = s.method(img);

		s.save(img, "Outline");
	}
}