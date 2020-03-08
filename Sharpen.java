/**
 * Sharpen kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Sharpen extends Filter{
	public Sharpen(){
		super(new int[] { 0, -1,  0,
						 -1,  5, -1,
						  0, -1,  0}, 1);
	}

	public static void main(String[] args)
	{
		Sharpen s = new Sharpen();
		BufferedImage img = s.readSource();
		img = s.method(img);

		s.save(img, "Sharpen");
	}
}
