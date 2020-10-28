import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

public class Oval extends Shape{

	private int height;
	private int width;
	
	public Oval(Color fillColor, Color borderColor, int x, int y, int width, int height) 
	{
		super(fillColor, borderColor, x, y);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2.0 * Math.PI * Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)) / 2.0);
	}

	public String toString()
	{
		return "Shape Name: Oval | Height: " + this.height + " | Width: " + this.width;
	}
	
	public boolean isEqual(Object obj)
	{
		if(obj instanceof Oval)
		{
			Oval o = (Oval) obj;
			return (o.getX() == getX()) && (o.getY() == getY()) && (o.height == height) && (o.width == width);
		}
		else
		{
			return false;
		}
	}
	
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(super.getBorderColor());
		g.drawOval(super.getX(), super.getY(), width, height);
		g.setColor(super.getFillColor());
		g.fillOval(super.getX(), super.getY(), width, height);
		
	}
	
	@Override
	boolean touchingPerim(int x, int y) 
	{
        return getX() - width <= 0 || getX() + width >= x || getY() - height <= 0 || getY() + height >= y;
    }

	@Override
	 public java.awt.Shape convertShape() 
	 {
	   return new Ellipse2D.Double(getX() - width, getY() - height, width, height);
	 }	

	
	 @Override
	  Shape collision(int newMoveX, int newMoveY) {
		 Oval oval= new Oval(getFillColor(), getBorderColor(), getX(), getY(),  width * (int)Math.sqrt(2), height * (int) Math.sqrt(2));
		 oval.setMoveX(newMoveX);
		 oval.setMoveY(newMoveY);
	        return oval;
	    }
	
}
