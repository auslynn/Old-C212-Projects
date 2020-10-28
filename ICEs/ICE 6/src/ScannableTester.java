import java.util.ArrayList;
import java.util.Collections;

public class ScannableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book one = new Book("Moby Dick", 4.00);
		Magazine two = new Magazine("Vogue", 1.00);
		Newspaper three = new Newspaper("NYTimes", .50);
		
		
		Scannable[] threeObjects = new Scannable[3];
		threeObjects[0] = one;
		threeObjects[1] = two;
		threeObjects[2] = three;
		
		for(Scannable oneObject : threeObjects)
		{
			System.out.println(oneObject.scanMe());
		}
		
		System.out.println();
		
		ArrayList<Comparable> threeMoreObjects = new ArrayList<>();
		threeMoreObjects.add(one);
		threeMoreObjects.add(two);
		threeMoreObjects.add(three);
		
		Collections.sort(threeMoreObjects);
		
		System.out.println("Comparison value of one with two is:" +threeMoreObjects.get(0).compareTo(threeMoreObjects.get(1)));
		System.out.println("Comparison value of two with three is:" +threeMoreObjects.get(1).compareTo(threeMoreObjects.get(2)));
		System.out.println("Comparison value of three with one is:" +threeMoreObjects.get(2).compareTo(threeMoreObjects.get(0)));
/*		
		for (int i = 0; i < threeMoreObjects.size(); i++)
		{
			if(obj instanceof Book)
			{
				System.out.println(((Book)obj).getName()+ ", $" +((Book)obj).getPrice());
			}
			else if(obj instanceof Magazine)
			{
				System.out.println(((Magazine)obj).getName()+ ", $" +((Magazine)obj).getPrice());
			}
			else if(obj instanceof Newspaper)
			{
				System.out.println(((Newspaper)obj).getName()+ ", $" +((Newspaper)obj).getPrice());
			}
		}
	}
*/
	}
}
