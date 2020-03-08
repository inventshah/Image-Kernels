
/**
 * Intensify kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Intensify extends Filter
{
	public Intensify()
	{
		super(new int[] {-1, -1, -1,
						 -1,  9, -1,
						 -1, -1, -1}, 1);
	}

	public static void main(String[] args)
	{
		Intensify s = new Intensify();
		BufferedImage img = s.readSource();
		img = s.method(img);
		
		s.save(img, "Intensify");
	}
}