package com.sourceit.java.basic.lesson14.exception;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CheckedExample {
	 private static final int SIZE = 10;
	 private static List<Integer> list = new ArrayList<Integer>(SIZE);


	public static void main(String[] args) {
		try{
			//IO
			PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		}catch (Exception e) {
			System.out.println("PrintWriter Error");
		}
		
		try{
		//Index Array
		for (int i = 0; i < SIZE; i++) {
			
				System.out.println("Value at: " + i + " = " + list.get(i));
			
		}
		
		}catch (Exception e) {
			System.out.println("List Error: " + e.getMessage());
		}
	}
}







