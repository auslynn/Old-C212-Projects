import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class Lab4Exercises{

	static int romanHelper (char c) // gets a value for the chars in the numeral
	{
		
	int numeral = 0;
	
	if (c == 'I')
	{
		numeral = 1;
	}
	else if (c == 'V')
	{
		numeral = 5;
	}
	else if (c == 'X')
	{
		numeral = 10;
	}
	else if (c == 'L')
	{
		numeral = 50;
	}
	else if (c == 'C')
	{
		numeral = 100;
	}
	else if (c == 'D')
	{
		numeral = 500;
	}
	else if (c == 'M')
	{
		numeral = 1000;
	}
	return numeral;
	}
	
		public static int romanToInt(String inputNumeral)
	    {
	        int romanTotal = 0;

	        int numeralLength = inputNumeral.length();
	        
	        int n = 0;
	        
	        for(n = 0; n < numeralLength; n = n + 1) //determines whether to subtract or add the values based on their sizes and positions
	        {
	            if((n + 1) < numeralLength && (romanHelper(inputNumeral.charAt(n)) < romanHelper(inputNumeral.charAt(n + 1))))
	            {
	                romanTotal = romanTotal - romanHelper(inputNumeral.charAt(n)); 
	            }
	            else
	                {
	                	romanTotal = romanTotal + romanHelper(inputNumeral.charAt(n));
	                }
	        }
	        
	        return Math.abs(romanTotal); // returns the absolute value of the numeral based on the summation above
	    }	
	public static void patterns() {
		
		Scanner scan = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		int pNum;
		char choice = 'Q';
		
		while (!(choice == 'E'))
		{
			System.out.println("Enter a number for the size of the pattern.");
			pNum = scan2.nextInt();
			System.out.println("Choose the type of pattern you would like to print.");
			System.out.println("A: Hourglass Pattern");
			System.out.println("B: Triangle Pattern");
			System.out.println("C: Diamond Pattern");
			System.out.println("E: Exit");
			choice = scan.next().charAt(0);
		
			if (choice == 'A')
			{
				
				for (int i = 1; i <= pNum; i++)
				{	
					
					for (int j = 1; j < i; j++)
					{
						System.out.print(" ");
					}
					
					for (int h = i; h <= pNum; h++)
					{
						System.out.print(h+ " ");
					}
					System.out.println();
					
				}
				
				for (int i = pNum - 1; i >= 1; i--)
				{
					
					for (int j = 1; j < i; j++)
					{
						System.out.print(" ");
					}
					
					for (int h = i; h <= pNum; h++)
					{
						System.out.print(h+ " ");
					}
					
					System.out.println();
				}
			}
			else if (choice == 'B') // this is hideous i know i think i did it better for the other 2
			{
				String spaceLeft = "";
				String totalStars = "**";
				String space = " ";
				for (int i = 0; i<pNum; i++)
				{
					spaceLeft = " "+spaceLeft;
				}
				
				System.out.print(spaceLeft+"*");
				
				for (int i = 2; i <= pNum; i++)
				{
					spaceLeft = spaceLeft.substring(1);
					System.out.println();
					System.out.print(spaceLeft);
					System.out.print("*");
					System.out.print(space);
					System.out.print("*");
					
					space = "  " +space;
					totalStars = "**"+totalStars;
				}
				System.out.println();
				System.out.println(totalStars+"*");
			}
			else if (choice == 'C')
			{
				int i = 0;
				int j = 0;
				int h = 0;
				
				for (i = 1; i <= pNum; i++)
				{
					
					for (h = 1; h <= pNum - i; h++)
					{
						System.out.print(" ");	
					}
					
					while (j != (i * 2 - 1))
					{
						if (j == i * 2 - 1 || j == 0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						j = j + 1;
					}
					j = 0;
					
					System.out.println();
				}
				
			} 
		//return "";
		}
		scan.close();
		scan2.close();
	}

	public static String randoms() {
		
		String numList = "";
		int randNum = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8= 0;
		int count9 = 0;
		int count10 = 0;
				
		for (int i = 0; i < 10; i++)
		{
			
			Random rand = new Random();
			randNum = rand.nextInt(10) + 1;
			numList = numList + randNum;
			
			switch(randNum)
			{
			case 1:
				count1 = count1 + 1;
				break;
			case 2:
				count2 = count2 + 1;
				break;
			case 3:
				count3 = count3 + 1;
				break;
			case 4:
				count4 = count4 + 1;
				break;
			case 5:
				count5 = count5 + 1;
				break;
			case 6:
				count6 = count6 + 1;
				break;
			case 7:
				count7 = count7 + 1;
				break;
			case 8:
				count8 = count8 + 1;
				break;
			case 9:
				count9 = count9 + 1;
				break;
			case 10:
				count10 = count10 + 1;
				break;
			}
			
		}
		return "The frequency of the numbers generated is as follows: \n1 -> "+count1+"\n2 -> "+count2+"\n2 -> "+count2+"\n3 -> "+count3+"\n4 -> "+count4+"\n5 -> "+count5+"\n6 -> "+count6+"\n7 -> "+count7+"\n8 -> "+count8+"\n9 -> "+count9+"\n10 -> "+count10;
		
	}

	public static boolean stringShuffler(String string1, String string2, String string3)
	{
		
		if ((string1.length() + string2.length() == string3.length()) && stringShufflerHelper(string1, string2, string3) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		public static boolean stringShufflerHelper(String string1, String string2, String string3)
		{
			String lowString1 = string1.toLowerCase();
			String lowString2 = string2.toLowerCase();
			String lowString3 = string3.toLowerCase();
			
			boolean stringsMatch = true;
			
			String stringTogether = lowString1 + lowString2;
			int stringTogetherLength = stringTogether.length();
			
			for (int i = 0; i < stringTogetherLength; i++)
			{
				char comparator = stringTogether.charAt(i);
				
				for (int j = 0; j < lowString3.length(); j++)
				{
					if (comparator == lowString3.charAt(j))
					{
						stringsMatch = true;
					}
					else
					{
						stringsMatch = false;
					}
				}
				
			}
			return stringsMatch;
		}
		
		
		
		public static void drawAudi()
		{
			DrawCircles image = new DrawCircles();
			JFrame frame = new JFrame();
			frame.setSize(300,300);
			frame.setTitle("Audi Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(image);
			frame.setVisible(true);
		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Roman numeral that you would like to convert to a decimal number.");
		String inputRN = scan.nextLine();
		System.out.println(romanToInt(inputRN));
		patterns();
		
		System.out.println(randoms());
		
		System.out.println(stringShuffler("abc", "Def", "dabecf"));
		
		drawAudi();
		
		scan.close();
	}

}
