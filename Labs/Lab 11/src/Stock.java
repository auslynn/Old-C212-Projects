/*
 * Author: Austin Lynn User: auslynn
 * Assignment: Lab 11
 * Date Last Updated: 4/22/20
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stock {

	private Queue<Block> purchases;
	private int totalStocks;
	
	public Stock()
	{
		this.purchases = new LinkedList<Block>();
		this.totalStocks = 0;
	}
	
	public void commands()
	{
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter a command");
			System.out.println("1) Buy quantity price");
			System.out.println("2) Sell quantity price");
			System.out.println("3) Quit");
			
			if(scan.hasNext())
			{
				String in = scan.next();
				in.toLowerCase();
				
				if(in.contentEquals("buy"))
				{
					Block tempBlock = new Block(scan.nextInt(), scan.nextInt());
					purchases.add(tempBlock);
					totalStocks = totalStocks + tempBlock.getShares();
				}
				else if (in.contentEquals("sell"))
				{
					int tempInt = scan.nextInt();
					if(tempInt > totalStocks)
					{
						System.out.println("You cannot sell this many stocks, because you own less stocks than you are trying to sell. Please try again.");
						scan.nextLine();
					}
					else
					{
						int tempInt2 = scan.nextInt();
						Block tempBlock = purchases.peek();
						int fin = 0;
						while (tempInt > 0)
						{
							if(tempBlock.getShares() <= tempInt)
							{
								tempBlock = purchases.remove();
								fin = fin + (tempInt2 * tempBlock.getShares());
								tempInt = tempInt - tempBlock.getShares();
								totalStocks = totalStocks - tempInt;
							}
							else if (tempBlock.getShares() > tempInt)
							{
								fin = fin + (tempInt * tempInt2);
								tempInt -= tempInt; //what is this
								totalStocks = totalStocks - tempInt;
							}
						}
						System.out.println("Total gain is: " +fin);
					}
				}
				else if (in.equals("quit"))
				{
					break;
				}
				else
				{
					System.out.println("Invald Input");
				}
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock stock = new Stock();
		stock.commands();
	}

}
