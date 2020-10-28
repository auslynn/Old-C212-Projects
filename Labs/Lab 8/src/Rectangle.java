/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Quadrilateral{

	private int length;
	private int width;
	
	public Rectangle(Color fillColor, Color borderColor, int x, int y, int length, int width)
	{
		super(fillColor, borderColor, x, y, pointMakerHelper(x, y, length, width));
		this.length = length;
		this.width = width;
	}
	
	static List<Point> pointMakerHelper(int x, int y, int length, int width)
	{
		List<Point> pnts = new ArrayList<>();
		pnts.add(new Point (x, y));
		pnts.add(new Point(x + width, y));
		pnts.add(new Point (x + width, y + length));
		pnts.add(new Point(x, y + length));
		
		return pnts;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * length + 2 * width;
	}
	
	public String toString()
	{
		return "Shape Name: Rectangle | Point Locations: " +pnts;
	}
	
	@Override
    boolean touchingPerim(int x, int y) 
	{
		return getX() - length <= 0 || getX() + length >= x || getY() - width <= 0 || getY() + width >= y;
	}

	 @Override
	 Shape collision(int moveX2, int moveY2) 
	 {
	     Rectangle rectangle = new Rectangle(getFillColor(), getBorderColor(), getX(), getY(), length * (int) Math.sqrt(2), width * (int) Math.sqrt(2));
	     rectangle.setMoveX(moveX2);
	     rectangle.setMoveY(moveY2);
	     return rectangle;
	 }
	 
	 @Override
	    public List<Point> points() {
	        List<Point> points = new ArrayList<>();
	        points.add(new Point(getX(), getY()));
	        points.add(new Point(getX() + length, getY() ));
	        points.add(new Point(getX() + length, getY()  + width));
	        points.add(new Point(getX(), getY() + width));

	        return points;
	    }
	
}
