/*
 * Author: Austin Lynn User: auslynn
 * Assignment: Lab 11
 * Date Last Updated: 4/22/20
 */
public class Block {

	private int shares;
	private int price;
	
	public Block(int shares, int price)
	{
		this.shares = shares;
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getShares()
	{
		return shares;
	}
	
	public void setShares(int shares)
	{
		this.shares = shares;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
}
