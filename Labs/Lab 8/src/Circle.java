import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Oval{

	private int radius;
	
	public Circle(Color fillColor, Color borderColor, int x, int y, int radius)
	{
		super(fillColor, borderColor, x, y, radius, radius);
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radius;
	}

	public String toString()
	{
		return "Shape Name: Circle | Radius: " + this.radius;
	}
	
}
