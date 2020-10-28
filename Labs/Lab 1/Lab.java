// ----------------------------------------------------
// Program for Lab 1. It draws 5 shapes made of asterisks
// ----------------------------------------------------
/*
 * Author: Austin Lynn
 * Date: 1/16/20
 * Version: 0.1
 */

public class Lab 
{
	public static void drawTriangle()
	{
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		System.out.println();
	}
	
	public static void drawUpsideDownTriangle()
	{
		System.out.println("*********");
		System.out.println(" ******* ");
		System.out.println("  *****  ");
		System.out.println("   ***   ");
		System.out.println("    *    ");
		System.out.println();
	}
	
	public static void drawDiamond()
	{
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(" ******* ");
		System.out.println("  *****  ");
		System.out.println("   ***   ");
		System.out.println("    *    ");
		System.out.println();
	}
	
	public static void drawDiamondOutline()
	{
		System.out.println("**********");
		System.out.println("****  ****");
		System.out.println("***    ***");
		System.out.println("**      **");
		System.out.println("*        *");
		System.out.println("**      **");
		System.out.println("***    ***");
		System.out.println("****  ****");
		System.out.println("**********");
		System.out.println();
	}
	
	public static void drawRightTriangle()
	{
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		drawTriangle();
		drawUpsideDownTriangle();
		drawDiamond();
		drawDiamondOutline();
		drawRightTriangle();
	}
	
	// The System class has the fields err, in, and out.

}
