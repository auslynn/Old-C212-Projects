////////////////////////////////////////////////////////////////////////////////////
//
//  C212
//
//  Lab8
//  @Austin Lynn  
//  draws the JFrame and calls a shape driver class to fill it with shapes
///////////////////////////////////////////////////////////////////////////////////

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

/*
 * Main application for random shape generator app
 * NOTE: You are encouraged to experiment and try out various approaches
 * The comments given here are just guidelines to get you started 
 * Possibly, this problem can be completed in many ways.
 */
public class ShapeWindow extends JFrame {

    static JPanel shapeDriverr;

    public ShapeWindow() {
        super();
       ShapeDriver shapeDriver = new ShapeDriver();
        
        setSize(600,600);
        this.getContentPane().add(shapeDriver);
        setVisible(true);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == 'h') {
                    shapeDriver.addShape();

                }
            }
        });
        

    }

    
    public static void main(String[] args) {
        // Create a JFrame and invoke the constructor
        JFrame shapeWindow = new ShapeWindow();
        shapeWindow.add(shapeDriverr);
    }
}
