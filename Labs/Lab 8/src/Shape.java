import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Area;

/*
 * Author: Austin Lynn , User: auslynn
 * Last Updated: 3/11/20
 * 
 */
abstract class Shape {
	
	 private int x;
	 private int y;
	 private Color fillColor;    
	 private Color borderColor;    
	 private Boolean isFilled;    
	 private Point Location;
	 private boolean shouldMove;
	 private int moveX;
	 private int moveY;
	 
	// the three constructors initialize the instance fields     
	public Shape(Color fillColor, Color borderColor, int x, int y)
	{
		this.fillColor = fillColor;
		this.borderColor = borderColor;
		this.Location = new Point(x, y);
	}
	
	public Shape(Color fillColor, int x, int y)
	{
		this.borderColor = Color.black;
		this.fillColor = fillColor;
		this.Location = new Point(x, y);
	}
	
	public Shape(int x, int y)
	{
		this.borderColor = Color.black;
		this.fillColor = Color.white;
		this.Location = new Point(x, y);
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color c) {
		this.fillColor = c;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color c) {
		this.borderColor = c;
	}

	public Point getLocation() {
		return Location;
	}

	public void setLocation(Point pt) {
		Location = pt;
	}
	
	
    // Note:  subclasses of Shape do not inherent private members so we need methods the subclasses 
    // can use to get the x and y values from the private Point instance field
	
	public int getX()
	{
		return this.Location.x;
	}
	
	public void setX(int x)
	{
		this.Location = new Point(x, this.Location.y);
	}
	
	public int getY()
	{
		return this.Location.y;
	}
	
	public void setY(int y)
	{
		this.Location = new Point(this.Location.x, y);
	}
	
    // if fillColor is white returns true, else returns false
	public boolean isFilled()
	{
		if (this.fillColor.equals(fillColor.white))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	// moves location by dx and dy    
	private void moveLocation(int dx, int dy)
	{ 
		Location = new Point((this.Location.x + dx), (this.Location.y + dy));
	} 
	
	abstract double getArea();
	abstract double getPerimeter();
	abstract void draw(Graphics g);
	
	public boolean getShouldMove()
	{
		return shouldMove;
	}
	
	public void setShouldMove(boolean shouldMove)
	{
		this.shouldMove = shouldMove;
	}
	
	public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    public int getMoveX() {
        return moveX;
    }

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }
    
    abstract boolean touchingPerim(int x, int y);
    
    abstract java.awt.Shape convertShape();
    
    public boolean inside(java.awt.Shape shape) 
    {
        Area a = new Area(convertShape());
        a.intersect(new Area(shape));
        return !a.isEmpty();
    }
   
    abstract Shape collision(int moveX2, int moveY2);
}
