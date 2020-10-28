// Austin Lynn, auslynn
// 1/30/20

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class MakeShapes extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box1 = new Rectangle(50,50,100,100);
		Rectangle box2 = new Rectangle(75,75,50,50);
		g2.draw(box1);
		g2.draw(box2);
		
		Ellipse2D.Double circle = new Ellipse2D.Double(63,63,75,75);
		g2.draw(circle);
		
	}
	
}
