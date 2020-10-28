////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Austin Lynn  
//  Explain: Generates random shapes and implements timer logic
///////////////////////////////////////////////////////////////////////////////////
 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

/*
 * Driver program for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be finished in many ways.
 */
public class ShapeDriver extends JPanel {

    // Panel constants
    public final int FRAME_WIDTH = 600;
    public final int FRAME_HEIGHT = 600;

    private Random random;
    private ScheduledExecutorService scheduledExecutorService;
    
   // private final Timer timer;
    private final long begin;
    private final CopyOnWriteArrayList<Shape> shapes;
    private int numRuns;
    List<Integer> able;
	
	// Need some data structure here to store all Shapes to be drawn
	// in the paintComponent
    
	// You can also keep other instance variables here as you deem fit
	
    public ShapeDriver() {
        super(); 
        random = new Random();
      //  timer = new Timer(100, this);
      //  timer.start();
        
        scheduledExecutorService = Executors.newScheduledThreadPool(0);
        shapes = new CopyOnWriteArrayList<>();
        

        able = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6));
        begin = System.currentTimeMillis();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
    }

    @Override
    public void paintComponent(Graphics g) {
        // calling super class paintComponent method
        // background will not be colored otherwise
        super.paintComponent(g);
        
        shapes.forEach(shape -> shape.draw(g));
    }
    
	public void addShape(){
		/*
		try {
            if (numRuns == 200) {
             //   timer.stop();
                return;
            }
            */
		
		
		int x = random.nextInt(FRAME_WIDTH - 50);
		int y = random.nextInt(FRAME_HEIGHT - 50);
		
		int shapeNum = able.get(random.nextInt(able.size()));
		Shape shape = null;
		Color randColor = randomColorGen();
		
		if (shapeNum == 0)
		{
			shape = new Triangle(randColor, Color.black, x, y, random.nextInt(21) + 3, random.nextInt(21) + 3);
		}
		else if (shapeNum == 1)
		{
			shape = new Oval(randColor, Color.black, x, y, random.nextInt(21) + 3, random.nextInt(21) + 3);
		}
		else if (shapeNum == 2)
		{
			shape = new Circle(randColor, Color.black, x, y, random.nextInt(21) + 3);
		}
		else if (shapeNum == 3)
		{
			shape = new Rectangle(randColor, Color.black, x, y, random.nextInt(21) + 3, random.nextInt(21) + 3);
		}
		else if (shapeNum == 4)
		{
			shape = new Square(randColor, Color.black, x, y, random.nextInt(21) + 3);
		}
		else if (shapeNum == 5)
		{
			shape = new Pentagon(randColor, Color.black, x, y, random.nextInt(21) + 3);
		}
		else if (shapeNum == 6)
		{
			shape = new Hexagon(randColor, Color.black, x, y, random.nextInt(21) + 3);
		}
		

        
            shapes.add(shape);
            paintComponent(getGraphics());
            
            int moveX;
            int moveY;
            
            do
            {
            	moveX = random.nextInt(5) - 2;
            	moveY = random.nextInt(5) - 2;
            }
            while(moveX == 0 && moveY == 0);
            
            shape.setMoveX(moveX);
            shape.setMoveY(moveY);
            scheduledExecutorService = Executors.newScheduledThreadPool(0);
            
           // scheduledExecutorService.schedule(() -> shape.setShouldMove(true), 1, TimeUnit.SECONDS);
		  } 
		
        
            
            
        /*    
            numRuns++;
            Thread.sleep(100);
    } catch (Exception ignored) 
		{
        if (System.currentTimeMillis() - begin >= 20000)
        	{
        	System.exit(0);
        	}
    }
    */

		
	public void moveShapes() 
	{
        for (Shape shape : shapes) 
        {
            if (shape.getShouldMove()) 
            {
                shape.setX(shape.getX() + shape.getMoveX());
                shape.setY(shape.getY() + shape.getMoveY());

                if (shape.touchingPerim(WIDTH, HEIGHT)) 
                	{
                	shapes.remove(shape);
                	}
            }
        }

        for (Shape shape : shapes) {
            for (Shape shape2 : shapes) {
                if (shape != shape2 && shape.equals(shape2)) 
                { 
                    if (shape.inside(shape2.convertShape())) 
                    {
                        System.out.println("Collision! " + shape + " and " + shape2);
                        if (shape.getFillColor().equals(shape2.getFillColor()))
                        {
                            shapes.remove(shape);
                            shapes.remove(shape2);
                            Shape collide;
                            if (shape.getArea() > shape2.getArea())
                            {
                                collide = shape.collision(shape2.getMoveX(), shape2.getMoveY());
                            }
                            else 
                            {
                            	collide = shape2.collision(shape.getMoveX(), shape.getMoveY());
                            }
                            collide.setShouldMove(true);
                            shapes.add(collide);
                        } 
                        else 
                        {
                            if (shape.getArea() > shape2.getArea())
                            	{
                            	shapes.remove(shape2);
                            	}
                            else 
                            	{
                            	shapes.remove(shape);
                            	}
                        }
                    }
                }
            }
        }

        repaint();
    }
		
		

	
	private Color randomColorGen()
	{
		return new Color (random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	
	 public ScheduledExecutorService getScheduledExecutorService() {
	        return scheduledExecutorService;
	    }
	
    // test client
    public static void main(String[] args) {

    }
}