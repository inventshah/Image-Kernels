/**
 * Edge Kernel - Top Bottom
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class EdgeTB extends Filter
{
	public EdgeTB()
	{
		super(new int[] {-1, -2, -1,
						  0,  0,  0,
						  1,  2,  1},
						  1);
	}

	public static void main(String[] args)
	{
		EdgeTB s = new EdgeTB();
		BufferedImage img = s.readSource();
		img = s.method(img);

		s.save(img, "EdgeTB");
	}
}