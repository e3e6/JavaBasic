package com.sourceit.java.basic.utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

	public static List<Integer> createSequence(int size){
		Integer[] arr = new Integer[size];

		for(int i = 0; i < size; i++){
			arr[i] = i;
		}

		return Arrays.asList(arr);
	}
	
	public static void debug(Object str){
		System.out.println(str);
	}
}
