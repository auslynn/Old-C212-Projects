/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle{

	private int sideLength;
	
	public Square(Color fillColor, Color borderColor, int x, int y, int sideLength)
	{
		super(fillColor, borderColor, x, y, sideLength, sideLength);
	}
	public String toString()
	{
		return "Shape Name: Square | Point Locations: " +pnts;
	}

}
