package com.sourceit.java.basic.lesson14.exception;

public class TooManyExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Stage 1.");
			
			String s = args[0];
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Stage 2. - Catch:" + ex.getMessage());
			
			throw new IllegalArgumentException("Ex from catch"); 
			
		} finally {
			System.out.println("Stage 3. Finally");
			
			String s = args[0];
		}
		
		System.out.println("Stage 4. End of program");
	}

}









