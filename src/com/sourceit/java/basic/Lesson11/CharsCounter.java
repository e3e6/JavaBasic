package com.sourceit.java.basic.Lesson11;

import java.util.List;
import java.util.Map;

/**
 * A class that get a large chunk of a text 
 *
 */
public interface CharsCounter {
	
	/**
	 * 
	 * @return the entire text
	 */
	public String getText();
	
	/**
	 * 
	 * @param c
	 * @return how often the character occurs in a text
	 */
	public int getCharFrequency(char c);
	/**
	 * 
	 * @param c
	 * @return the number of characters c
	 */
	public int getCharCount(char c);
	
	/**
	 * 
	 * @return collection of unique characters and it's counts
	 */
	public Map<String, Integer> getChars();
	
	/**
	 * 
	 * @return a list of words in a text
	 */
	public List<String> words();
	
	public int getMaximumCount();
	public int getMinimumCount();
	
	public char getCharByCount(int count);
}
