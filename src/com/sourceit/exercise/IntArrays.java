package com.sourceit.exercise;

/**
 * Smart array. Exercise of Lesson 7
 * @author alex
 *
 */
public interface IntArrays {
	/**
	 * Add element A to the end of array
	 * @param a element to be added
	 */
	public void add(int a);
	/**
	 * Get element by index
	 * @param i index
	 * @return
	 */
	public int get(int i);
	
	/**
	 * Return array size
	 * @return
	 */
	public int size();
}