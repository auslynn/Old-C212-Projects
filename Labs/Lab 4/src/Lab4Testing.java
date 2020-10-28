import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Testing {

	@Test
	void test() {
		assertEquals(1, Lab4Exercises.romanToInt("I"));
		assertEquals(2, Lab4Exercises.romanToInt("II"));
		assertEquals(3, Lab4Exercises.romanToInt("III"));
		assertEquals(4, Lab4Exercises.romanToInt("IV"));
		assertEquals(5, Lab4Exercises.romanToInt("V"));
		assertEquals(6, Lab4Exercises.romanToInt("VI"));
		assertEquals(7, Lab4Exercises.romanToInt("VII"));
		assertEquals(8, Lab4Exercises.romanToInt("VIII"));
		assertEquals(9, Lab4Exercises.romanToInt("IX"));
		assertEquals(10, Lab4Exercises.romanToInt("X"));
		assertEquals(50, Lab4Exercises.romanToInt("L"));
		assertEquals(100, Lab4Exercises.romanToInt("C"));
		assertEquals(500, Lab4Exercises.romanToInt("D"));
		assertEquals(1000, Lab4Exercises.romanToInt("M"));
		assertEquals(1978, Lab4Exercises.romanToInt("MCMLXXVIII"));
		
		assertEquals(true, Lab4Exercises.stringShuffler("abc", "Def", "dabecf"));
		assertEquals(false, Lab4Exercises.stringShuffler("zeg","deg","d"));
		assertEquals(false, Lab4Exercises.stringShuffler("zeg","deg","dddddd"));
		assertEquals(false, Lab4Exercises.stringShuffler("zeg","deg","ggeezz"));
		assertEquals(false, Lab4Exercises.stringShuffler("zeg","deg","DDDDDD"));
	}

}
