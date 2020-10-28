import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolarComplexTester {

	@Test
	void test() {
		
		PolarComplex test1 = new PolarComplex(1, 2);
		StandardComplex test2 = new StandardComplex(3, 4);
		
		assertEquals("(1.0, 2.0)", test1.toString());
		
		//assertEquals(true, test1.isEqual(test1));
		assertEquals(false, test2.isEqual(test1));
		
		
	}

}
