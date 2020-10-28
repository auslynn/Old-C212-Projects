/*
 * Author: Austin Lynn, User: auslynn
 * Creation: 1/30/20
 * Assignment: Lab 3
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab3Tests{

	@Test
	public void test() {
		assertEquals(198, Lab3Exercises.my1089Puzzle(1));
		assertEquals(1089, Lab3Exercises.my1089Puzzle(381));
		
		assertEquals("(555)555-5555", Lab3Exercises.formatPhoneNumber("5555555555", true));
		assertEquals("555-555-5555", Lab3Exercises.formatPhoneNumber("5555555555", false));
		
		assertEquals("Your grade is between 93.0 and 100.", Lab3Exercises.grade('A'));
		assertEquals("Your grade is between 93.0 and 100.", Lab3Exercises.grade('a'));
		assertEquals("Your grade is between 83.0 and 93.0.", Lab3Exercises.grade('B'));
		assertEquals("Your grade is between 83.0 and 93.0.", Lab3Exercises.grade('b'));
		assertEquals("Your grade is between 73.0 and 83.0.", Lab3Exercises.grade('C'));
		assertEquals("Your grade is between 73.0 and 83.0.", Lab3Exercises.grade('c'));
		assertEquals("Your grade is between 63.0 and 73.0.", Lab3Exercises.grade('D'));
		assertEquals("Your grade is between 63.0 and 73.0.", Lab3Exercises.grade('d'));
		assertEquals("Your grade is between 0 and 63.0.", Lab3Exercises.grade('F'));
		assertEquals("Your grade is between 0 and 63.0.", Lab3Exercises.grade('f'));
		assertEquals("The character that you entered is not within the proper range.", Lab3Exercises.grade('Q'));
		
		assertEquals("Hex Value is: 0x01", Lab3Exercises.intToHex(1));
		assertEquals("Hex Value is: 0x0A", Lab3Exercises.intToHex(10));
		assertEquals("Hex Value is: 0x10", Lab3Exercises.intToHex(16));
	}

}
