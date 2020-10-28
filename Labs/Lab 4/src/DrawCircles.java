import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class DrawCircles extends JComponent {

	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		Stroke stroke = new BasicStroke(10);
		g2.setStroke(stroke);
		
		g2.setPaint(Color.magenta);
		Ellipse2D.Double circle1 = new Ellipse2D.Double(10,100,80,80);
		g2.draw(circle1);
		g2.setPaint(Color.orange);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(130,100,80,80);
		g2.draw(circle3);
		g2.setPaint(Color.pink);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(70,100,80,80);
		g2.draw(circle2);
		g2.setPaint(Color.cyan);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(190,100,80,80);
		g2.draw(circle4);
	}
	
}
