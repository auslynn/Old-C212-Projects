/*
 * Author: Austin Lynn | User: auslynn
 * Assignment: Lab 10
 * Date Last Updated: 4/15/20
 */

public class StringData {

	private String word;
	private int count;
	private int length;
	
	public StringData(String word)
	{
		this.word = word;
		this.length = word.length();
	}
	
	public String getString()
	{
		return "The length of the word " +word+ "is " +length;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
}
