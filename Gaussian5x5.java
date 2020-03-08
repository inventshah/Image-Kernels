
/**
 * Gaussian 5x5 Kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Gaussian5x5 extends Filter
{
	public Gaussian5x5()
	{
		super(new int[] {1,  4,  6,  4, 1,
						 4, 16, 24, 16, 4,
						 6, 24, 36, 24, 6,
						 4, 16, 24, 16, 4,
						 1,  4,  6,  4, 1}, 2);
	}

	public static void main(String[] args)
	{
		Gaussian5x5 s = new Gaussian5x5();
		BufferedImage img = s.readSource();
		img = s.method(img);

		s.save(img, "Gaussian5x5");
	}
}