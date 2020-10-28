/*
 * Author: Austin Lynn | User: auslynn
 * Assignment: Lab 10
 * Date Last Updated: 4/15/20
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FrequencyCounter {
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Set<String> words = new HashSet<>();

	private int numWords;
	private int numLines;
	private int distinctWords;
	private String finalString;
	ArrayList<StringData> stringInformation = new ArrayList<>();
	
	public FrequencyCounter(String filename)
	{
		try {
			
		File file = new File(filename);
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine())
		{
			this.numLines = this.numLines + 1;
			String line = scan.nextLine();
			String[] wordsInLine = line.split(" ");
			
			for(String word : wordsInLine)
			{
				this.numWords = this.numWords + 1;
				
				if(map.containsKey(word))
				{
					int wordCounter = map.get(word);
					map.remove(word);
					map.put(word, wordCounter + 1);
				}
				else
				{
					map.put(word, 1);
					this.distinctWords = this.distinctWords + 1;
					stringInformation.add(new StringData(word));
				}
				
				if(!words.contains(word))
				{
					words.add(word);
				}
				
			}
			scan.close();
		}
		
	    }
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		this.finalString = "The total number of words is: " +numWords+ "\nThe total number of lines is: " +numLines+ "\nFrequency of words: " +map+ "\nAll unique words: " +words;
		System.out.println(finalString);
		
		

	}
	
	public String getFinalString() {
		return finalString;
	}




	public void setFinalString(String finalString) {
		this.finalString = finalString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrequencyCounter tinyTale = new FrequencyCounter("tinyTale.txt");
		
		String fileString = tinyTale.getFinalString(); 
	
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("statistics.txt"));
				writer.write(fileString);
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

}
