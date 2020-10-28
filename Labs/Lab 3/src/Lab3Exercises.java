/*
 * Author: Austin Lynn, User: auslynn
 * Creation: 1/30/20
 * Assignment: Lab 3
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Exercises {

	public static int my1089Puzzle(int myInput) {
		
		
			String inputStr = Integer.toString(myInput);
		
			if (inputStr.length() == 1) {
				inputStr = "00"+inputStr;
				myInput = Integer.parseInt(inputStr);
			}
		
			else if (inputStr.length() == 2) {
				inputStr = "0"+inputStr;
				myInput = Integer.parseInt(inputStr);
			}
		
			else {
				myInput = Integer.parseInt(inputStr);
			}
		
			String inputStrCut = inputStr.substring(inputStr.length() - 3, inputStr.length());
			int lastThreeOfOriginalInput = Integer.parseInt(inputStrCut);
		
			String inputStrCutReversed = "";
			for(int i = inputStrCut.length() - 1; i >= 0; i--) {
				inputStrCutReversed = inputStrCutReversed + inputStrCut.charAt(i);
			}
			int lastThreeOfOriginalInputReversed = Integer.parseInt(inputStrCutReversed);
		
			int reversedMinusOriginal = Math.abs(lastThreeOfOriginalInputReversed - lastThreeOfOriginalInput);
			String strReversedMinusOriginal = Integer.toString(reversedMinusOriginal);
		
			String strDifferenceReversed = "";
			for(int i2 = strReversedMinusOriginal.length() - 1; i2>=0; i2--) {
				strDifferenceReversed = strDifferenceReversed + strReversedMinusOriginal.charAt(i2);
			}
			int differenceReversed = Integer.parseInt(strDifferenceReversed);
		
			int addedDifferences = reversedMinusOriginal + differenceReversed;
		
		/* For Testing
		System.out.println("Last 3 Numbers of Input: " +inputStrCut);
		System.out.println("Reversed: " +lastThreeOfOriginalInputReversed);
		System.out.println("Difference: " +reversedMinusOriginal);
		System.out.println("Difference Reversed: " +strDifferenceReversed);
		System.out.println("Added Differences: " +addedDifferences);
		*/
		
			return addedDifferences;
	}
	
	public static String formatPhoneNumber(String myNumber, boolean choice) {
		
		/* Pseudocode
		 * This program will allow a user to format their phone number in two different ways
		 *  Divide the phone number into three parts to allow for different types of formatting
		 *  If the user chooses true, print the number with parentheses
		 *  If the user chooses false, print the number with only dashes
		 */
		
			String strMyNumber1 = myNumber.substring(0, 3);
			String strMyNumber2 = myNumber.substring(3, 6);
			String strMyNumber3 = myNumber.substring(6, 10);
		
			if (choice == true) {
				myNumber = "("+strMyNumber1+")"+strMyNumber2+"-"+strMyNumber3;
			}
			else {
				myNumber = strMyNumber1+"-"+strMyNumber2+"-"+strMyNumber3;
			}
		
			return myNumber;
	}

	public static String numbersList() {
		
		System.out.println("Enter a number between 5 and 19.");
		Scanner scan4 = new Scanner(System.in);
		int uInput = 0;
		ArrayList intList = new ArrayList();
		
		while (scan4.hasNextInt())
		{
			uInput = scan4.nextInt();
			if (uInput < 5 || uInput > 19)
			{
				System.out.println("Please enter a number between 5 and 19.");
			}
			else
			{
				if(intList.contains(uInput))
					{
					System.out.println("Enter another number between 5 and 19.");
					
					}
				else
				{
					intList.add(uInput);
					System.out.println("Enter another number between 5 and 19.");
				}
			}
		}
		return intList.toString();
	}
	
	public static String grade(char myGrade) 
	{
		
		if (myGrade == 'A' || myGrade == 'a')
		{
			return "Your grade is between 93.0 and 100.";
		}
		else if (myGrade == 'B' || myGrade == 'b')
		{
			return "Your grade is between 83.0 and 93.0.";
		}
		else if(myGrade == 'C' || myGrade == 'c')
		{
			return "Your grade is between 73.0 and 83.0.";
		}
		else if(myGrade == 'D' || myGrade == 'd')
		{
			return "Your grade is between 63.0 and 73.0.";
		}
		else if(myGrade == 'F' || myGrade == 'f')
		{
			return "Your grade is between 0 and 63.0.";
		}
		else
		{
			return "The character that you entered is not within the proper range.";
		}
	}
	
	public static String intToHex(int n)
	{
		
		String hexValue = "";
		
		char hexList[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};
		
		int remainder;
		
		while (n > 0)
		{
			remainder = n % 16;
			hexValue = hexList[remainder]+hexValue;
			n = n/16;
		}
		
		if (hexValue.length() == 1)
		{
			return "Hex Value is: 0x0"+hexValue;
		}
		else
		{
			return "Hex Value is: 0x"+hexValue;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		System.out.println("Enter an integer.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(input);
		System.out.println(my1089Puzzle(input));
		
		System.out.println("Enter your unformatted phone number.");
		Scanner scan1 = new Scanner(System.in);
		String number = scan1.nextLine();
		System.out.println("Would you like your phone number formatted with parentheses? (Type 'true' for yes, 'false' for no.)");
		boolean userChoice = scan1.nextBoolean();
		System.out.println(formatPhoneNumber(number, userChoice));
		
		System.out.println(numbersList());

		System.out.println("Enter a letter A-F to see your grade.");
		Scanner scan2 = new Scanner(System.in);
		char myGrade = scan2.next().charAt(0);
		System.out.println(grade(myGrade));
		
		System.out.println("Enter an integer to convert to hexadecimal.");
		Scanner scan3 = new Scanner(System.in);
		int hexInput = scan3.nextInt();
		System.out.println(intToHex(hexInput));
		
	}
	
	/* a. Give the type and value for each of the following expressions
	 * i. 7.8 > 78 - Boolean, False
	 * ii. 12 + 13 + 19 + 21 - Int, 65
	 * iii. 2.3 + 5.7 + 7.1 - Double, 15.1
	 * iv. 2 + 4 + "24" - String, 624
	 * 
	 * b.
	 * i. Predicted: 9, Actual: 3.00009155413138
	 * 	  Reasoning: The while loop doesn't immediately terminate because of the absolute value function
	 * ii. Predicted: 007, Actual: 007
	 * 
	 * iii. Predicted: Bee Bee Bee, Actual: Won't compile without a semi-colon after "Bye Bye Bye"
	 * 		With the semi-colon, Bee Bee Bee is printed
	 */

}
