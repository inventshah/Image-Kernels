/**
 * Sachin Shah
 */

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("STARTING");
		int[] SIZING = new int[] {1}; // Add more values to increase width of filter

		Red red = new Red();
		Green green = new Green();
		Blue blue = new Blue();

		Inverse inverse = new Inverse();

		Box box = new Box();
		Max max = new Max();
		Min min = new Min();

		BufferedImage img = readSource();
		save(img, "source_copy");
		
		// Function based
		save(red.replace(img), "RGB_red");
		save(green.replace(img), "RGB_green");
		save(blue.replace(img), "RGB_blue");
		save(inverse.replace(img), "inverse");
		
		for (int i : SIZING)
		{
			save(box.method(img, i),"box_" + (i + i +1));
			save(max.method(img, i),"max_" + (i + i + 1));
			save(min.method(img, i),"min_" + (i + i + 1));
		}
		
		Gaussian3x3 g3x3 = new Gaussian3x3();
		save(g3x3.method(img), "g3x3");
	
		EdgeRL edgerl = new EdgeRL();
		save(edgerl.method(img), "edgeRL");
		
		EdgeTB edgetb = new EdgeTB();
		save(edgetb.method(img), "edgeTB");
		
		Sharpen sharpen = new Sharpen();
		save(sharpen.method(img), "sharpen");
		
		Intensify intensify = new Intensify();
		save(intensify.method(img), "intensify");
		
		Emboss emboss = new Emboss();
		save(emboss.method(img), "emboss");
		
		Outline outline = new Outline();
		save(outline.method(img), "outline");

		System.out.println("FINISHED");
	}
	
	public static BufferedImage readSource()
	{
		try
		{
			File file = new File("Source.png");
			return (BufferedImage) ImageIO.read(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return null;
	}
	public static void save(BufferedImage pic, String name)
	{
		System.out.println("Saving  " + name);
		try
		{
			ImageIO.write(pic, "png", new File("output/" + name + ".png"));
		}
		catch (Exception e)
		{
			System.out.println("unable to save image");
		}
	}
}