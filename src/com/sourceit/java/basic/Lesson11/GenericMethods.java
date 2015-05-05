package com.sourceit.java.basic.Lesson11;

import java.util.Arrays;

public class GenericMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] intArray = new Integer[10];
		
		GenericMethods.<Integer> fillArray(intArray, 10);
//		GenericMethods.<Integer> fillArray(intArray, "10");
		
		
		System.out.println(Arrays.asList(intArray));
	}

	public static <T> void fillArray(T[] array, T val){
		for(int i = 0; i < array.length; i++){
			array[i] = val;
		}
	}
}
