/*
 * Author: Austin Lynn User: auslynn
 * Assignment: ICE 7
 * Date Last Updated: 3/12/20
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Tester extends JFrame implements KeyListener{

	static ICESevenStarter tester;
	
	
	// again if you want to use Tester as a keyListener, then you should:
	//1. setup the keyListener in the constructor
	//2. setup the three functions for keyListener, you only need to complete one of them
	
	public Tester() throws FileNotFoundException {
		// TODO?
		
		tester = new ICESevenStarter(250,250);
		JFrame frame = new JFrame("Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.getContentPane().add(tester);
		frame.addKeyListener(this);
	}

	// TODO? 

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyChar() == 'c')
		{
			tester.setDisplay(tester.getCOB());
		}
		else if (e.getKeyChar() == 'n')
		{
			tester.setDisplay(tester.getNames());
		}
		else if (e.getKeyChar() == 'b')
		{
			tester.setDisplay("Bye");
		}
		
		tester.repaint();
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO
		// Create and show Tester as the JFrame.
		
		Tester test = new Tester();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
