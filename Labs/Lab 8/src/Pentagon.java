import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Pentagon extends Polygon{

	private int sideLength;
	
	public Pentagon(Color fillColor, Color borderColor, int x, int y, int sideLength)
	{
		super(fillColor, borderColor, x, y, pentagonPointHelper(x, y, sideLength));
		this.sideLength = sideLength;
	}
	
	private static List<Point> pentagonPointHelper(int x, int y, int sideLength)
	{
		List<Point> pnts = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			pnts.add(new Point((int) (y + sideLength * Math.sin(2 * Math.PI * i / 5)), (int) (x + sideLength * Math.cos(2 * Math.PI * i / 5))));
		}
		
		return pnts;		
	}
	
	public String toString()
	{
		return "Shape Name: Pentagon | Side Length: " +sideLength;
	}
	
	double getArea() {
		return 1.0 / 4.0 * Math.pow(sideLength, 2) * Math.sqrt(5.0 * (5.0 + 2.0 * Math.sqrt(5)));
	}
	
	double getPerimeter() {
		return sideLength * 5;
	}
	
	@Override
    boolean touchingPerim(int x, int y) {
        int num = (int) (((double) sideLength) / (2.0 * Math.tan(180.0/5))); // this is evil. it took so long to do this and idk why
        return getX() - num <= 0 || getX() + num >= x || getY() - num <= 0 || getY() + num >= y;
    }
	
	@Override
    Shape collision(int moveX2, int moveY2) {
        Pentagon pentagon = new Pentagon(getFillColor(), getBorderColor(), getX(), getY(), sideLength * (int) Math.sqrt(2));
        pentagon.setMoveX(moveX2);
        pentagon.setMoveY(moveY2);
        return pentagon;
    }
	
	 @Override
	    public  List<Point> points() {
	        List<Point> points = new ArrayList<>();
	        for (int i = 0; i < 5; i++){
	            points.add(new Point((int) (getX() + sideLength * Math.cos(2 * Math.PI * i / 5)),
	                    (int) (getY() + sideLength * Math.sin(2 * Math.PI * i / 5))));
	        }

	        return points;
	    }
}
