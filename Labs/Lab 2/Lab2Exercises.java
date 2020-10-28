//  Lab 2 
//  
//  Released:  1/20/20
//
//  @Author: Austin Lynn , auslynn
//  Last Edited:  1/29/20
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit 
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects) 
// It is a class that provides functionality and will be used to complete one of the methods
import java.lang.Math;
import java.util.Scanner;

public class Lab2Exercises {
    
    // computes area of a square when given its side length
    public static double areaOfSquare(double sideLength) {
      //TODO
    	return Math.pow(sideLength, 2);
    }

    // computes perimeter of a square when given its side length
    public static double perimeterOfSquare(double sideLength) {
      //TODO
    	return sideLength * 4;
    }

    // computes volume of a cubic when given its side length
    public static double volumeOfCube(double sideLength) {
      //TODO
    	return Math.pow(sideLength, 3);
    }
       
    // returns a String with three lines in the following format:
    // On Line1: "Length of one Side of Square is: *
    // On Line2: "Area: *, Perimeter: **, Volume: **** " where * refers to area, ** refers to 
    // perimeter of square and *** refers to volume of the cube respectively. 
    public static void printMeasurements(int value) {
      //TODO 
      // Please reuse any of the functions defined above.
    	System.out.println("The length of one side of the square is" +value+ ".");
    	System.out.print("Area: " +areaOfSquare((double) (value))+ ", ");
    	System.out.print("Perimeter: " +perimeterOfSquare((double) (value))+ ", ");
    	System.out.print("Volume: " +volumeOfCube((double)(value))+ ".");
    
    }
    
	// given two points (x1,y1) and (x2,y2) return y intercept 	of the line
    public static double lineFunction(double x1, double y1, double x2, double y2) {
      //TODO 
    	double slope = (y2 - y1)/(x2 - x1);
    	return (double)(y2 - (slope * x2));
    }

    // reads a number between 1000 and 1 Billion and prints it with commas (,) separating 
    // every three digits. for example: 12317910 will be printed as $12,317,910
    // hint use modulus (%) to save part of the number, then concatenate back together as a String
    public static String addCommas(int num) {
      //TODO
    	String strNum = String.format("%,d", num);
    	return strNum;
    		
    	}
    		
    	
    	
    
    // test client 
    public static void main(String[] args) {
      //TODO: Modify to test all functions
      // Use Scanner to read inputs from user. Don't use Scanner in above functions!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the side length of the square or cube.");
        int value = sc.nextInt();
        printMeasurements(value);
        
        System.out.println();
        System.out.println("Enter the first x-coordinate of a line.");
        double x1 = sc.nextDouble();
        System.out.println("Enter the first y-coordinate of a line.");
        double y1 = sc.nextDouble();
        System.out.println("Enter the second x-coordinate of a line.");
        double x2 = sc.nextDouble();
        System.out.println("Enter the second y-coordinate of a line.");
        double y2 = sc.nextDouble();
        System.out.println("The y-intercept of your line is: " +lineFunction(x1, y1, x2, y2)+ ".");
        
        System.out.println("Enter a number between 1000 and 1000000.");
        int num = sc.nextInt();
        System.out.println(addCommas(num));
        
        
        int i = 10;
        int n = ++i;
        n = i++;
        System.out.println(++i % 5);
        i = i++;
    	
    }
}

///////////////////////////////////
//                               //
// ANSWER THE FOLLOWING QUESTIONS //
//                               //
///////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types  
 *
 * 1.  What happens if you multiply an int with a char? 
 * An integer gets returned
 * 2.  What happens if you multiply a double with a char? 
 * A double gets returned
 * 3.  What happens if you square a char? 
 * An integer gets returned
 * 4.  What happens if a method has a parameter of type int, but you pass it a char?
 * The char gets converted to an integer based on its ASCII value
 * 5.  What happens if a method has a parameter of type char, but you pass it an int? 
 * An error will occur; a char can be changed to an int when needed, but an int won't be changed to a char.
 * 6.  What is the difference between two floating point primitive data types in the Java?
 * Double uses 8 bytes of data while float uses 4 bytes.
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *     The program won't compile as written. However, the final value of i is 13 and the final value of n is 11 in the updated code.
 *     What are the final value printed?
 *     The program won't compile as written. However, with updates made, the final value printed is 3.
 *     Now Compile and Run the Program to check your answers. If they are different, explain why 
 *     and provide updated code!  
 *       
 *       int i = 10;
 *       int n = ++i;
 *       n = i++;
 *       System.out.println(++i % 5);
 *       i = i++;
 */
