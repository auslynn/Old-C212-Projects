////////////////////////////////////////////////////////////////////////////////////
//  C212
//  Lab 2
//  @Author  Austin Lynn , auslynn
//  Last Edited:  1/29/20
//
//////////////////////////////////////////////////////////////////////////////////

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterToIntegerTest {

	@Test
	void test() {
		Lab2Integer test = new Lab2Integer();
		String output = test.characterToInteger('D');
		assertEquals("The integer value of D is 68.\n", output);
	}

}
