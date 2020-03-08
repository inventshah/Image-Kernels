
/**
 * Gaussian 7x7 Kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Gaussian7x7 extends Filter
{
	public Gaussian7x7()
    {
		super(new int[] {0,  0,   0,   5,   0,  0, 0,
						 0,  5,  18,  32,  18,  5, 0,
						 0, 18,  64, 100,  64, 18, 0,
						 5, 32, 100, 100, 100, 32, 5,
						 0, 18,  64, 100,  64, 18, 0,
						 0,  5,  18,  32,  18,  5, 0,
						 0,  0,   0,   5,   0,  0, 0}, 3);
	}

	public static void main(String[] args)
    {
		Gaussian7x7 s = new Gaussian7x7();
		BufferedImage img = s.readSource();
		img = s.method(img);
		
		s.save(img, "Gaussian7x7");
	}
}