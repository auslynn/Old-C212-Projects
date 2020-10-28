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
public class Lab2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Design:
		// Create a method that takes a character as an input and outputs a string with that character
		// typecasted to an integer
		// Call the method as many times as needed in the main function, printing the result each time
		
	System.out.print(characterToInteger('A'));
	System.out.print(characterToInteger('B'));
	System.out.print(characterToInteger('C'));
	System.out.print(characterToInteger('Z'));
	System.out.print(characterToInteger('X'));
	System.out.print(characterToInteger('a'));
	System.out.print(characterToInteger('b'));
	System.out.print(characterToInteger('c'));
	System.out.print(characterToInteger('y'));
	System.out.print(characterToInteger('u'));
	System.out.print(characterToInteger('0'));
	System.out.print(characterToInteger('9'));
	System.out.print(characterToInteger('2'));
	System.out.print(characterToInteger('$'));
	System.out.print(characterToInteger('*'));
	System.out.print(characterToInteger('-'));
	System.out.print(characterToInteger('|'));
	System.out.print(characterToInteger('\\'));
	System.out.print(characterToInteger(' '));
	System.out.print(characterToInteger('\t'));
		
		
	}
	
	public static String characterToInteger(char c) {
		
		 return "The integer value of "+c+" is "+(int) c+".\n";
		
	}

}
