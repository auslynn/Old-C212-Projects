/*
 * Author: Austin Lynn
 * User: auslynn
 * Last Updated: 4/8/20
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

public abstract class Polygon extends Shape{

	private List<Point> pnts;
	
	public Polygon(Color fillColor, Color borderColor, int x, int y, List<Point> pnts)
	{
		super(fillColor, borderColor, x, y);
		this.pnts = pnts;
	}
	
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		java.awt.Polygon p = new java.awt.Polygon(); // to avoid confusion in names needed to use java.awt
		for (Point point : pnts)
		{
			p.addPoint(point.x, point.y);
		}
		g.setColor(getBorderColor());
		g.drawPolygon(p);
		g.setColor(getFillColor());
		g.fillPolygon(p);
	}

	public boolean isEqual(Object obj)
	{
		if (obj instanceof Polygon)
		{
			Polygon p = (Polygon) obj;
			return (p.pnts.equals(pnts));
		}
		else
		{
			return false;
		}
	}
	
	 public abstract List<Point> points();

	    @Override
	    public java.awt.Shape convertShape() {
	        java.awt.Polygon poly = new java.awt.Polygon();
	        for (Point point : points()) poly.addPoint(point.x,point.y);
	        return poly;
	    }
	
	public String toString()
	{
		return "Shape Name: Polygon | Points: " +pnts;
	}
	
}
