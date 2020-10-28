/*
 * Author: Austin Lynn User: auslynn
 * Last Updated: 3/4/20
 * Assignment: Lab 7
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

// ---> DrawCannonball Class
public class DrawCannonball extends JComponent {
  // Declare an array list here. This is what you
 // will be drawing with
	private ArrayList<Point> points;
	
 // Constructor here that takes an 
 // ArrayList as argument
 public DrawCannonball(ArrayList input)
 {
	 points = input;
 }
 
 public void paint(Graphics g) {
 // Go over all the points in your ArrayList and
 // draw circles. You might wanna flip the y coord though
 // using getheight()-y
	 Graphics2D g2 = (Graphics2D) g;
	 
	 for (int i = 0; i < points.size(); i++)
	 {
		 Ellipse2D.Double circle = new Ellipse2D.Double(points.get(i).x, getHeight() - points.get(i).y, 2, 2);
		 g2.fill(circle);
	 }
	 
 }
 
 public static void main(String[] args) {
 // Create a Cannonball obj
 // Use Scanner to take inputs
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the initial x position.");
	 double initXPos = scan.nextDouble();
	 System.out.println("Enter the launch angle.");
	 double initAlpha = scan.nextDouble();
	 System.out.println("Enter the intial velocity.");
	 double initV = scan.nextDouble();
	 System.out.println("Enter the amount of time to simulate.");
	 double initDeltaSec = scan.nextDouble();
	 scan.close();
 // Call shoot method and store everything 
 // to an ArrayList
	 Cannonball ball = new Cannonball(initXPos);
	 ArrayList<Point> shots = ball.shoot(initAlpha, initV, initDeltaSec);
 // Instantiate an obj of this class and
	 DrawCannonball image = new DrawCannonball(shots);
 // do the regular JFrame stuff 
 // (setSize, add, setVisible etc etc)
	 JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		frame.setTitle("Cannonball Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(image);
		frame.setVisible(true);
 }
}