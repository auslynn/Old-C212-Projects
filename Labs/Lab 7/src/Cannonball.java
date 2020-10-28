/*
 * Author: Austin Lynn User: auslynn
 * Last Updated: 3/4/20
 * Assignment: Lab 7
 */
import java.awt.Point;
import java.util.ArrayList;

// ----> Cannonball Class
public class Cannonball {
 private double xPosition, yPosition;
 private double xVelocity, yVelocity;
 private static final double g = 9.81;
 
 public Cannonball(double xPos)
 {
	 xPosition = xPos;
	 yPosition = 0;
	 xVelocity = 0;
	 yVelocity = 0;
 }
 
 public void move(double deltaSec) {
 // Update xPosition, yPosition and yVelocity
	
	 xPosition = xPosition + (xVelocity * deltaSec);
	 yVelocity = yVelocity - (g * deltaSec);
	 
 }
 
 public Point getLocation() {
 // returns a new Point object with xPosition and yPos
	 
	 Point location = new Point((int) xPosition, (int) yPosition);
	 return location;
 }
 
 public ArrayList<Point> shoot(double alpha, double v, double deltaSec){
 // Calculate initial xVelocity and yVelocity using
 // Math.cos() and Math.sin() 
 // Keep on calling move and store the
 // respective coords of current location into an ArrayList
 // while yPosition > 0 
 // How do you get the current location tho???
	
	xVelocity = v * Math.cos(alpha);
	yVelocity = v * Math.sin(alpha);
	
	ArrayList<Point> locations = new ArrayList<Point>();
	
	while (yPosition > 0)
	{
		for (int i = 0; i < deltaSec; i++)
		{
			move(deltaSec);
			locations.add(getLocation());
		}
	}
	return locations;
 }
}
