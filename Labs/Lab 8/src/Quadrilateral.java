/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.List;

public abstract class Quadrilateral extends Shape{

	protected List<Point> pnts;
	
	public Quadrilateral(Color fillColor, Color borderColor, int x, int y, List<Point> pnts)
	{
		super(fillColor, borderColor, x, y);
		this.pnts = pnts;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString()
	{
		return "Shape Name: Quadrilateral | Point Locations: " +pnts;
	}
	
	public boolean isEqual(Object obj)
	{
		if (obj instanceof Quadrilateral)
		{
			Quadrilateral q = (Quadrilateral) obj;
			return (q.pnts.equals(pnts));
		}
		else
		{
			return false;
		}
	}
	
	abstract List<Point> points();
	
	  @Override
	    public java.awt.Shape convertShape() {
	        java.awt.Polygon quad = new java.awt.Polygon();
	        for (Point point : points()) quad.addPoint(point.x, point.y);
	        return quad;
	    }
	
	public void draw(Graphics g)
	{
		Polygon poly = new Polygon();
		for (Point point : pnts)
		{
			poly.addPoint((int) point.getX(), (int) point.getY());
		}
		g.setColor(super.getBorderColor());
		g.drawPolygon(poly);
		g.setColor(super.getFillColor());
		g.fillPolygon(poly);
		
	}
	
}
