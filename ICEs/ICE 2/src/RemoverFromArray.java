/*
 * Author: Austin Lynn User: auslynn
 * Date Created: 2/11/20
 * Assignment: In Class Exercise 5
 */


import java.util.ArrayList;
import java.util.Scanner;

public class RemoverFromArray {

	public static String findSecondLargest(){
		
		ArrayList <Double> values = new ArrayList <Double>();
		double inputDouble = 0;
		double largest = 0;
		double secondLargest = 0;
		int secondLargestLocation = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values that you'd like to have in your list. Enter -1 to end the additions.");
		inputDouble = scan.nextDouble();
		
		for (inputDouble = 0; inputDouble != -1; count = count + 1)
		{
			inputDouble = scan.nextDouble();
			
			if (inputDouble > largest)
			{	
				secondLargest = largest;
				largest = inputDouble;		
			}
			else if (inputDouble > secondLargest)
			{
				secondLargest = inputDouble;
				secondLargestLocation = count;
			}
		}
		scan.close();
		return "The second largest value is " +secondLargest+ "\nThe location of the second largest value is " +secondLargestLocation;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findSecondLargest());
		
	}

}
