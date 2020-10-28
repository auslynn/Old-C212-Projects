/*
 * Author: Austin Lynn
 * User: auslynn
 * Date Last Updated: 4/9/20
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class ICE8 {

	public static void main(String[] args)
	{
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Theo");
		names.add("Mitrakis");
		
		names.add("Jay");
		names.add("Korman");
		
		names.add("James");
		names.add("Ashcraft");
		
		names.add("Brooke");
		names.add("Lynn");
		
		names.add("Lynn");
		names.add("Smith");
		
		names.add("Christo");
		names.add("Mitrakis");
		
		names.add("Thomas");
		names.add("Ryan");
		
		names.add("Ryan");
		names.add("Smith");
		
		names.add("Natasha");
		names.add("Carlton");
		
		names.add("Dan");
		names.add("Kapitan");
		
		System.out.println("First List: " +names);
		System.out.println();
		
		Set<String> setOfNames = new HashSet<String>();
		for (int i = 0; i < 20; i++)
		{
			setOfNames.add(names.get(i));
		}
		System.out.println("First Set: " +setOfNames);
		System.out.println();
		
		ListIterator<String> iterator = names.listIterator();
		
		ArrayList<String> news = new ArrayList<>();
		for(int i = 0; i < 20; i++)
		{
			if(news.contains(iterator.next()))
			{
				iterator.remove();
			}
			else
			{
				news.add(iterator.previous());
				iterator.next();
			}
		}
		
		System.out.println("Final List with no duplicates: "+news);
	}
	
}
