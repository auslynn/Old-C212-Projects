/*
 * Assignment: ICE 4
 * Author: Austin Lynn User: auslynn
 * Last Updated: 2/27/20
 */

import java.awt.Rectangle;

public class Square extends Rectangle{

	int xcent;
	int ycent;
	int slength;
	
	public void setXCent(int x)
	{
		this.xcent = x;
	}
	
	public void setYCent(int y)
	{
		this.ycent = y;
	}
	
	public void setSLength(int sideLength)
	{
		this.slength = sideLength;
	}
	
	public Square(int x, int y, int sideLength)
	{
		setLocation (x - (sideLength / 2), y + (sideLength / 2));
		setSize (sideLength, sideLength);
	}
	
	public int getArea()
	{
		return (int) (getWidth() * getHeight());
	}
	
	public String toString()
	{
		return "Square: X-Coord of Center: " +xcent+ " | Y-Coord of Center: " +ycent+ " | Side Length: " +slength;
	}
	
}
