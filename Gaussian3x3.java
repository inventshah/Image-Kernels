
/**
 * Gaussian 3x3 Kernel
 * 
 * Sachin Shah 
 */

import java.awt.image.BufferedImage;

public class Gaussian3x3 extends Filter
{
    public Gaussian3x3()
    {
        super(new int[] {1, 2, 1,
        				 2, 4, 2,
        				 1, 2, 1}, 1);
    }

    public static void main(String[] args)
    {
        Gaussian3x3 s = new Gaussian3x3();
        BufferedImage img = s.readSource();
        img = s.method(img);

        s.save(img, "Gaussian3x3");
    }
}