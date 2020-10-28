/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape{
	
	private int height;
	private int sideLength;
	
	int[] xCoords = new int[3];
	int[] yCoords = new int[3];
	
	public Triangle(Color fillColor, Color borderColor, int x, int y, int height, int sideLength) 
	{
		super(fillColor, borderColor, x, y);
		this.height = height;
		this.sideLength = sideLength;
		// TODO Auto-generated constructor stub
	}


	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 1.0/2.0 * sideLength * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return sideLength * 3;
	}

	public String toString()
	{
		return "Shape Name: Triangle | Height: " + this.height + " | Side Length: " + this.sideLength;
	}
	
	public boolean isEqual(Triangle t)
	{
		if (! this.getBorderColor().equals(t.getBorderColor()))
		{
			return false;
		}
		else if (! this.getFillColor().equals(t.getFillColor()))
		{
			return false;
		}
		else if (! this.getLocation().equals(t.getLocation()))
		{
			return false;
		}
		else if (this.height != t.height)
		{
			return false;
		}
		else if (this.sideLength != t.sideLength)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void draw(Graphics g)
	{
		
		xCoords[0] = (int) (this.getX() - (sideLength / 2.0));
		xCoords[1] = (int) (this.getX() + (sideLength / 2.0));
		xCoords[2] = this.getX();
		
		yCoords[0] = this.getY() + height;
		yCoords[1] = this.getY() + height;
		yCoords[2] = this.getY();
		
		g.setColor(super.getBorderColor());
		g.drawPolygon(xCoords, yCoords, 3);
		g.setColor(super.getFillColor());
		g.fillPolygon(xCoords, yCoords, 3);
		
	}
	
	 @Override
	 Shape collision(int moveX2, int moveY2) 
	 {
	        Triangle triangle = new Triangle(getFillColor(), getBorderColor(), getX(), getY(), sideLength * (int) Math.sqrt(2), height * (int) Math.sqrt(2));
	        triangle.setMoveX(moveX2);
	        triangle.setMoveY(moveY2);
	        return triangle;
	 }
	 
	 @Override
	 boolean touchingPerim(int x, int y) 
	 {
	        return getX() <= 0 || getX() + 2 * sideLength >= x || getY() - height <= 0 || getY() +height>= y;
	 }
	 
	 @Override
	    public java.awt.Shape convertShape() {
	        java.awt.Polygon triangle = new java.awt.Polygon(new int[]{getX(), getX() + sideLength, getX()  + sideLength * 2}, new int[]{getY(), getY() - height, getY()}, 3);
	        return triangle;
	    }
}
