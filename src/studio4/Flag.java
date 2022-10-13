package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(128,64,0);
		StdDraw.filledRectangle(0.5, 0.25, 0.49, 0.24);
		StdDraw.setPenColor(0,128,0);
		StdDraw.filledRectangle(0.5, 0.75, 0.49, 0.24);
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.49, 0.49);
		
	}
}