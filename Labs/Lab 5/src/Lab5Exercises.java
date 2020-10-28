import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lab5Exercises {
	
	// beginning of longest run
	public static int longestRun(int[] rolls)
	{
		
		int lastRoll = rolls[0];
		int currentRun = 1;
		int firstIndex = 0;
		int maxLength = 0;
		
		for (int i = 1; i < rolls.length; i++)
		{
			
			if (rolls[i] == lastRoll)
			{
				currentRun = currentRun + 1;
			}
			else if (rolls[i] != lastRoll)
			{
				if (currentRun > maxLength)
				{
				maxLength = currentRun;
				firstIndex = i - maxLength;
				}
				
				lastRoll = rolls[i];
				currentRun = 1;
				
			}
			
			if (i == rolls.length - 1)
			{
				lastRoll = rolls[i - 1];
			
			
				if (rolls[i] == lastRoll)
				{
					if (currentRun > maxLength)
					{
					maxLength = currentRun;
					}
			
				firstIndex = i - maxLength;
			
				}
			
			}
		}

		return firstIndex;
	}
	
	// helps format the printing of the resulting array 
	public static void printerHelper (int[] rolls, int firstIndex) //void? maybe. check
	{
		
		int currentRun = 0;
		
		while (currentRun < rolls.length)
		{
			if (currentRun != firstIndex)
			{
				System.out.print(rolls[currentRun] + " ");
			}
			
			else if (currentRun == firstIndex)
			{
				System.out.print("(");
				
				while (rolls[currentRun] == rolls[firstIndex])
				{
					System.out.print(rolls[currentRun] + " ");
					
					currentRun = currentRun + 1;
				}
				System.out.print(rolls[firstIndex] + ") ");
			}
			currentRun = currentRun + 1;
		}
	} // this doenst work for a lot of cases. i dont know why.
	
	/*
	 // beginning of bulgarian solitaire problem
	
	ArrayList<Integer> cards = new ArrayList<Integer>();
	static Random rand = new Random();
	
	// removes the zeros in the array list (removes the empty piles of cards)
	public static void noZeros(ArrayList<Integer> cards)
	{
		for (int i = 0; i < cards.size(); i++)
		{
			if (cards.get(i) == 0)
			{
				cards.remove(i);
			}
		}
	}
	
	// the step where the cards move from other piles into a new pile
	public static void moveCards(ArrayList<Integer> cards)
	{
		int newStackNum = 0;
		
		for (int i = 0; i < cards.size(); i++)
		{
			cards.set(i, cards.get(i) - 1);
			if (cards.get(i) == 0)
			{
				noZeros(cards);
			}
			newStackNum = newStackNum + 1;
		}
		cards.add(newStackNum);
	}
	
	// putting it all together
	public static void bulgarianSolitaire()
	{
		ArrayList<Integer> cards = new ArrayList<Integer>();
		int randSum = 0;
		boolean huh = true; //decides when to continue with the first step (generating decks)
		boolean huh2 = false; //decides when to continue with the rest of the steps (the card moving steps)
		
		while (huh == true)
		{
			if (randSum < 45)
			{
				cards.add(rand.nextInt(46-randSum)); // makes piles and subtracts the total number of cards in each pile so far
			}
			else
			{
				huh = false;	
			}
			
			for (int i = 0; i < cards.size(); i++)
			{
				randSum = randSum + cards.get(i);
			}
		}
		
			while (huh2 == true)
			{
				moveCards(cards);
				System.out.println(cards);
				if (cards.contains(1) && cards.contains(2) && cards.contains(3) && cards.contains(4) && cards.contains(5) && cards.contains(6) && cards.contains(7) && cards.contains(8) && cards.contains(9))
				{
					huh2 = false;
				}
			}
			
		}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rolls = new int[20];
		Random rand = new Random();
		
		for (int i = 0; i < rolls.length; i++)
		{
			int randRoll = rand.nextInt(6) + 1;
			
			rolls [i] = randRoll;	
		}
		
		
		System.out.print("Longest run is: ");
		printerHelper(rolls, longestRun(rolls));
		
		//bulgarianSolitaire();
		
		
		
		boolean[][] booleanMatrix = new boolean[3][2];
		for (int i = 0; i < 4; i++)
		{
			//booleanMatrix[i][i] = 
		}
		
	//	Matrix booleanMatrix = new Matrix(matrix);
		
		System.out.println(booleanMatrix.toString());
		}
	}

// i am going to use one of the makeup weeks for this. i am so sorry to whoever had to read this garbage it will be BETTER NEXT TIME