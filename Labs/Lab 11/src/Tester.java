import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void test() {

		ShortRoute route = new ShortRoute();
		String in = ("Pendleton Pierre 2\n" +
    			"Pendleton Pueblo 8\n" +
    			"Pendleton Phoenix 4\n" +
    			"Pierre Pueblo 3\n" +
    			"Pierre Pendleton 2\n" +
    			"Phoenix Pendleton 4\n" +
    			"Phoenix Pittsburgh 10\n" +
    			"Phoenix Pensacola 5\n" +
    			"Phoenix Pueblo 3\n" +
    			"Phoenix Peoria 4\n" +
    			"Peoria Pueblo 3\n" +
    			"Peoria Phoenix 4\n" +
    			"Peoria Pittsburgh 5\n" +
    			"Pittsburgh Pensacola 4\n" +
    			"Pittsburgh Princeton 2\n" +
    			"Pittsburgh Peoria 5\n" +
    			"Pittsburgh Phoenix 10\n" +
    			"Pensacola Phoenix 5\n" +
    			"Pensacola Pittsburgh 4\n" +
    			"Pensacola Princeton 5\n" +
    			"Princeton Pittsburgh 2\n" +
    			"Princeton Pensacola 5\n" + "quit\n");
		InputStream input = new ByteArrayInputStream(in.getBytes()); // idk whats happening anymore im so sorry
		System.setIn(input);
		assertEquals("[[Phoenix, 4], [Pueblo, 8], [Pierre, 2], [Peoria, 8], [Pittsburgh, 13], [Pensacola, 9], [Princeton, 14]]", route.smallestDistance());
		
		
	}

}
