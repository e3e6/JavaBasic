package com.sourceit.java.basic.lesson15.streams;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		inExample();
		
		consoleExample();
	}
	
	private static void inExample() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter String");
			String s = br.readLine();
	        
	        System.out.println("Received a string: " + s);
	        
	        System.out.println("Enter Integer:");
	        try{
	            int i = Integer.parseInt(br.readLine());
	            
	            System.out.println("Received an integer: " + i);
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	}
	
	private static void consoleExample(){
		Console c = System.console();
	        if (c == null) {
	            System.err.println("No console.");
	            System.exit(1);
	        }

	        String login = c.readLine("Enter your login: ");
	        char [] oldPassword = c.readPassword("Enter your old password: ");


	            boolean isMatch;
				do {
	                char [] newPassword1 = c.readPassword("Enter your new password: ");
	                char [] newPassword2 = c.readPassword("Enter new password again: ");
	                isMatch = Arrays.equals(newPassword1, newPassword2);
	                if (isMatch) {
	                	c.format("Password for %s changed.%n", login);	   
	                	//TODO do password change
	                } else {
	                	 c.format("Passwords don't match. Try again.%n");
	                }
	                Arrays.fill(newPassword1, ' ');
	                Arrays.fill(newPassword2, ' ');
	            } while (!isMatch);

	}

}
