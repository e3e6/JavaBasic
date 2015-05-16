package com.sourceit.java.basic.lesson13.ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static com.sourceit.java.basic.utils.Utils.debug;

/**
 * Out of the box sorting example
 *
 */
public class Default {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List strings = Arrays.asList(new String[]{"bed", "cat", "apple"});
		Collections.sort(strings);
		          	
		debug(strings);
		
		List integers = Arrays.asList(new Integer[]{300, 100, 200});
		Collections.sort(integers);
		
		debug(integers);
	}

}