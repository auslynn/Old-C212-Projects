/*
 * Author: Austin Lynn User: auslynn
 * Last Updated: 3/4/20
 * Assignment: Lab 7
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandardComplexTester {

	StandardComplex test1 = new StandardComplex(1, 2);
	StandardComplex test2 = new StandardComplex(3, 4);
	PolarComplex test3 = new PolarComplex(1,2);
	@Test
	void test() {
		
		assertEquals("(1.0, 2.0)", test1.toString()); 
		
		//assertEquals(new StandardComplex(1.0,-2.0), test1.getConjugate());
		
		//assertEquals(new StandardComplex(1.0, 2.0), test1.getStandardComplex());
		
		assertEquals(false, test1.isEqual(test2));
		assertEquals(true, test1.isEqual(test1));
		assertEquals(false, test3.isEqual(test1));
		
	}

}
