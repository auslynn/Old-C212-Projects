/*
 * Author: Austin Lynn User: auslynn
 * Assignment: Lab 11
 * Date Last Updated: 4/22/20
 */
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class ShortRoute {

	public String smallestDistance()
	{
		Map<String, TreeSet<DistanceTo>> routes = new HashMap<String, TreeSet<DistanceTo>>();
		
		Scanner scan = new Scanner(System.in);
		
		String beginning = "none";
		String in;
		System.out.println("Enter the routes in the form city1 city2 distance. Enter Q to stop input");
		
		while(scan.hasNextLine())
		{
			in = scan.next();
			if (in.equals("Q") || in.contentEquals("q"))
			{
				break;
			}
			if (beginning.equals("none"))
			{
				beginning = in;
			}
			if(routes.containsKey(in))
			{
				TreeSet<DistanceTo> tempTree = 	routes.get(in);
				tempTree.add(new DistanceTo(scan.next(), Integer.parseInt(scan.next())));
				routes.put(in, tempTree);
			}
			else
			{
				TreeSet<DistanceTo> tempTree = new TreeSet<DistanceTo>();
				tempTree.add(new DistanceTo(scan.next(), Integer.parseInt(scan.next())));
				routes.put(in, tempTree);
			}
		}
		
		PriorityQueue<DistanceTo> queue = new PriorityQueue<DistanceTo>();
		
		queue.add(new DistanceTo(beginning, 0));
		
		Map<String, Integer> shortestKnownDistance = new HashMap<String, Integer>();
		
		while(!queue.isEmpty())
		{
			DistanceTo tempDT = queue.remove();
			
			if(!shortestKnownDistance.containsKey(tempDT.getTarget()))
			{
				int d = tempDT.getDistance();
				shortestKnownDistance.put(tempDT.getTarget(), d);
				
				TreeSet<DistanceTo> holder = routes.get(tempDT.getTarget());
				
				while(!holder.isEmpty())
				{
					DistanceTo tempDT2 = holder.first();
					queue.add(new DistanceTo (tempDT2.getTarget(), d + tempDT2.getDistance()));
				}
			}
		}
		
		System.out.println(shortestKnownDistance);
		scan.close();
		return (shortestKnownDistance.toString());
	}
	
	public static void main(String[] args)
	{
		ShortRoute route = new ShortRoute();
		
		route.smallestDistance();
	}
	
}
