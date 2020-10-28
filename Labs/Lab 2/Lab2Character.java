////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/20/20
//
//  Lab 2
//  @Author  Austin Lynn , auslynn
//  Last Edited:  1/29/20
//
//////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Lab2Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(integerToCharacter());
		
		
	}

	public static String integerToCharacter() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 255.");
		int i = scan.nextInt();
		char c = (char) i;
		
		
		return "The character representation of the integer you provided is " +c+".";
		
	}
	
}
