import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		Triangle triangle = new Triangle(Color.green, Color.black, 50, 50, 15, 15);
		
		assertEquals("Shape Name: Triangle | Height: 15 | Side Length: 15", triangle.toString());
		assertEquals(true, triangle.isEqual(triangle));
		assertEquals(false, triangle.isEqual(new Triangle(Color.red, Color.black, 50, 50, 15, 15)));
		
		List<Point> pnts = new ArrayList<>();
		pnts.add(new Point (1,1));
		pnts.add(new Point (2,2));
		pnts.add(new Point(3,3));
		pnts.add(new Point(4,4));
		pnts.add(new Point(5,5));
		pnts.add(new Point(6,6));
		pnts.add(new Point(7,7));
		Polygon polygon = new Polygon(Color.green, Color.black, 50, 50, pnts);
		
		assertEquals("Shape Name: Polygon | Points: "+pnts, polygon.toString());
		assertEquals(true, polygon.isEqual(polygon));
		assertEquals(false, polygon.isEqual(triangle));
		
		Hexagon hexagon = new Hexagon(Color.green, Color.black, 50, 50, 15);
		
		assertEquals("Shape Name: Hexagon | Side Length: 15", hexagon.toString());
		assertEquals(true, hexagon.isEqual(hexagon));
		assertEquals(false, hexagon.isEqual(polygon));
		
		Pentagon pentagon = new Pentagon(Color.green, Color.black, 50, 50, 15);
		
		assertEquals("Shape Name: Pentagon | Side Length: 15", pentagon.toString());
		assertEquals(true, pentagon.isEqual(pentagon));
		assertEquals(false, pentagon.isEqual(hexagon));
		
		List<Point> pnts2 = new ArrayList<>();
		pnts.add(new Point (1,1));
		pnts.add(new Point (2,2));
		pnts.add(new Point(3,3));
		pnts.add(new Point(4,4));
		Quadrilateral quad = new Quadrilateral(Color.green, Color.black, 50, 50, pnts2);
		
		assertEquals("Shape Name: Quadrilateral | Point Locations: "+pnts2, quad.toString());
		assertEquals(true, quad.isEqual(quad));
		assertEquals(false, quad.isEqual(polygon));
		
		Rectangle rectangle = new Rectangle(Color.green, Color.black, 50, 50, 15, 20);
		
		assertEquals("Shape Name: Rectangle | Point Locations: " +rectangle.pointMakerHelper(50,50,15,20), rectangle.toString());
		assertEquals(true, rectangle.isEqual(rectangle));
		assertEquals(false, rectangle.isEqual(triangle));
		
		Square square = new Square(Color.green, Color.black, 50, 50, 15);
		
		assertEquals("Shape Name: Square | Point Locations: " +rectangle.pointMakerHelper(50,50,15,15), square.toString());
		assertEquals(true, square.isEqual(square));
		assertEquals(false, square.isEqual(rectangle));
		
		Oval oval = new Oval(Color.green, Color.black, 50, 50, 20, 15);
		
		assertEquals("Shape Name: Oval | Height: 15 | Width: 20", oval.toString());
		assertEquals(true, oval.isEqual(oval));
		assertEquals(false, oval.isEqual(square));
		
		Circle circle = new Circle(Color.green, Color.black, 50, 50, 15);
		
		assertEquals("Shape Name: Circle | Radius: 15", circle.toString());
		assertEquals(true, circle.isEqual(circle));
		assertEquals(false, circle.isEqual(oval));
		
	}

}
