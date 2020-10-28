/*
 * Assignment: Lab 6
 * Author: Austin Lynn User: auslynn
 * Last Updated : 2/26/20
 */
public class GameOfLifeTest {

	public static void main(String[] args)
	{
		
		boolean[][] stillLife = {
									{false, false, false, false},
									{false, true, true, false},
									{false, true, true, false},
									{false, false, false, false}
								};
		
		boolean[][] oscillator = {
									{false, false, false, false, false},
									{false, false, false, false, false},
									{false, true, true, true, false},
									{false, false, false, false, false},
									{false, false, false, false, false}
								 };
		
		GameofLife gol1 = new GameofLife(stillLife);
		System.out.println(gol1.toString());
		
		GameofLife gol2 = new GameofLife(oscillator);
		System.out.println(gol2.toString());
		
		
	}
}
