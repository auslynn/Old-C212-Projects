import javax.swing.JFrame;

/*
 * Assignment: Lab 6
 * Author: Austin Lynn User: auslynn
 * Last Updated : 2/26/20
 */
public class CheckBoard {
	
	
	public static void printCheckBoard(int size)
	{
		
		JFrame frame = new JFrame();
		frame.setSize((size * 8 + 100),(size * 8 + 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawBoard board = new DrawBoard();
		board.setSize(size);
		frame.add(board);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCheckBoard(20);
		printCheckBoard(50);
	}

	

}
