/*
 * Assignment: ICE 4
 * Author: Austin Lynn User: auslynn
 * Last Updated: 2/27/20
 */

import java.util.ArrayList;
import java.util.Random;

public class SquareTester {

	public static void main(String[] args)
	{
		
		ArrayList<Square> squares = new ArrayList<>();
		
		Random rand = new Random();
		
		
		for (int i = 0; i < 5; i++)
		{
			int randx = rand.nextInt(200);
			int randy = rand.nextInt(200);
			int randLength = rand.nextInt(50);
			
			Square square = new Square(randx, randy, randLength);
			
			square.setXCent(randx);
			square.setYCent(randy);
			square.setSLength(randLength);
			
			squares[i] = square;
			
			System.out.println(square.toString());
		}
	}
	
}
