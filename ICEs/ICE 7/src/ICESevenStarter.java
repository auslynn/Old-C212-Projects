/*
 * Author: Austin Lynn User: auslynn
 * Assignment: ICE 7
 * Date Last Updated: 3/12/20
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import javax.swing.KeyStroke;


public class ICESevenStarter extends JComponent{
	
	//For me, it is better to initiate some data when creating the fields
	//So that you will not encounter null exceptions later
	private String countryOfBirth = "";
	private String names = "";
	private String lastName = "";
	private String firstName = "";
	private int xLoc = 0;
	private int yLoc = 0;
	
	// TODO?
	// you might need another fields at here
	
	private String display = "";
	
	public void setDisplay(String i)
	{
		this.display = i;
	}
	
	public String getCOB()
	{
		return this.countryOfBirth;
	}
	
	public String getNames()
	{
		return this.names;
	}
	
	public ICESevenStarter(int xLoc, int yLoc) throws FileNotFoundException{
		// TODO
		// initiate x and y location as input x and y location
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		// initiate other fields by reading the files
		File inputFile = new File("input.txt");
		Scanner scan = new Scanner(inputFile);
		PrintWriter out = new PrintWriter("output.txt");
		
		this.firstName = scan.next();
		this.lastName = scan.next();
		this.countryOfBirth = scan.next();
		this.names = firstName+ " " +lastName;
	   

	   // You can choose to store the new data to file directly in here
	   // Or you can create a function to do that
	   out.println(countryOfBirth);
	   out.println(lastName+ ", " +firstName);
	   
	   scan.close();
	   out.close();
	}

    public void paintComponent(Graphics g) {
    	// TODO
    	// print the text you want to draw at here
    	
    	g.setColor(Color.magenta);
    	g.drawString(display, this.xLoc, this.yLoc);
    	
    }
    
    
    // TODO?
    // think about how to change your text in this class
    // if you choose to set Tester as KeyListener, then you should have set of setters for the fields to be called in Tester.java
    // If you choose to set this class as KeyListener, then you can directly setup the three functions for keyListener, and change the text to draw in here. 

}
