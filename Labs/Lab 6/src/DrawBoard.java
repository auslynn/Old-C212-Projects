import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Arrays;

import javax.swing.JComponent;
/*
 * Assignment: Lab 6
 * Author: Austin Lynn User: auslynn
 * Last Updated : 2/26/20
 */
public class DrawBoard extends JComponent {

	public int sideSize;
	
	public void setSize(int size)
	{
		this.sideSize = size;
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		for (int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				for(int k = 0; k < 3; k = k + 3)
				{
					int[] x1 = new int[3];
					int[] x2 = new int[3];
					int[] y1 = new int[3];
					int[] y2 = new int[3];
					
					y1[k] = sideSize * i;			//y coords for first triangle
					y1[k + 1] = sideSize * (i + 1);
					y1[k + 2] = sideSize * (i + 1);
					
					y2[k] = sideSize * i;			// y coords for second triangle
					y2[k + 1] = sideSize * i;
					y2[k + 2] = sideSize * (i + 1);
					
					
					x1[k] = sideSize * j;			// x coords for first triangle
					x1[k + 1] = sideSize * j;
					x1[k + 2] = sideSize * (j + 1);
					
					x2[k] = sideSize * j;			// x coords for second triangle
					x2[k + 1] = sideSize * (j + 1);
					x2[k + 2] = sideSize * (j + 1);
					
					if (((j % 2 == 0) && (i % 2 == 0)) || ((j % 2 != 0) && (i % 2 != 0)))
					{
						g2.setColor(Color.cyan);
						
					}
					else if (((j % 2 != 0) && (i % 2 == 0)) || ((j % 2 == 0) && (i % 2 != 0)))
					{
						g2.setColor(Color.magenta);
					}
					
					g2.fillPolygon(x1, y1, 3);
					g2.fillPolygon(x2, y2, 3);
					
				}
			}
		}
	}	
}
