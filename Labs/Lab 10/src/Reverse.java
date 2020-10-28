/*
 * Author: Austin Lynn | User: auslynn
 * Assignment: Lab 10
 * Date Last Updated: 4/15/20
 */

public class Reverse {

	public static String recursiveReverse(String s)
	{
		
		if (s.isEmpty())
		{
			return s;
		}
		else
		{
			return recursiveReverse(s.substring(1)) + s.charAt(0);
		}
		
	}
	
	public static String iterativeReverse(String s)
	{
		String str = "";
		StringBuffer reversedString = new StringBuffer();
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			str = reversedString.append(s.charAt(i)) + "";
		}
		
		return str;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(recursiveReverse("Hello!"));
		
		System.out.println(iterativeReverse("Hello!"));
	}
	
}
