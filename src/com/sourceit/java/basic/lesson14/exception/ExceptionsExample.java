package com.sourceit.java.basic.lesson14.exception;

import java.awt.AWTException;
import java.util.Arrays;

public class ExceptionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		try {
			int result = 100 / parseInt(args);		
			System.out.println("val = " + result);
			
		} catch (IllegalArgumentException nn) {
			System.out.println(nn.getMessage());
		}
		finally {
			System.out.println("Exit program.");
		}
		
		
	}
	
	public static Integer parseInt(String[] str){
    	
	   if(str.length == 0){
	          throw new IllegalArgumentException("Error: We should have at least one argument");
	   }
		
		
		return Integer.valueOf(str[0]);
	}

}










