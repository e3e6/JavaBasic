package com.sourceit.java.basic.Lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.sourceit.java.basic.utils.Utils;

public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Utils.createSequence(10); 
		
		shuffle(list, new Random());
		
		System.out.println(list);
		
		//Range view
		System.out.println(list.subList(2, 4));
	}

	public static <E> void swap(List<E> a, int posIndex1, int posIndex2) {
	    E tmp = a.get(posIndex1);
	    a.set(posIndex1, a.get(posIndex2));
	    a.set(posIndex2, tmp);
	}
	
	public static void shuffle(List<?> list, Random rnd) {
	    for (int i = list.size(); i > 1; i--)
	        swap(list, i - 1, rnd.nextInt(i));
	}
}
