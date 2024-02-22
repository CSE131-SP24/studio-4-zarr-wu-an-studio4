package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;

public class Flag {
	public static void main(String[] args) {
		
		Color background = new Color(29, 181, 237);
		StdDraw.setPenColor(background);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		
		Color plus1 = new Color(130, 255, 133);
		StdDraw.setPenColor(plus1);
		
		int degree = 135;
		Font font = new Font("Arial", Font.BOLD, 200);
		   StdDraw.setFont(font);
		   StdDraw.text(0.5, 0.5, "l", degree);
		   
	    int degree2 = 45;
		Font font2 = new Font("Arial", Font.BOLD, 140);
			   StdDraw.setFont(font2);
			   StdDraw.text(0.35, 0.4, "l", degree2);
		
		
		
		
	}
}