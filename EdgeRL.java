/**
 * Edge Detection - Left Right
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class EdgeRL extends Filter
{
	public EdgeRL()
	{
		super(new int[] {-1, 0, 1,
						 -2, 0, 2,
						 -1, 0, 1},
						 1);
	}

	public static void main(String[] args)
	{
		EdgeRL s = new EdgeRL();
		BufferedImage img = s.readSource();
		
		img = s.method(img);

		s.save(img, "EdgeRL");
	}
}