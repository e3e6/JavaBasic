package com.sourceit.java.basic.lesson14.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CatchExample {

    private List<Integer> list = new ArrayList<Integer>(SIZE);
    private static final int SIZE = 2;

	
    public void writeList() {
    	
    	list.add(10);
    	list.add(20);
    	
        PrintWriter out = null;

        try {
            System.out.println("Entering" + " try statement");

            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: "
                               +  e.getMessage());
                                     
        } catch (IOException e) {
            System.out.println("Caught IOException: " +  e.getMessage());
                                     
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } 
            else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public void simple(){
    	int i =  1;
    }
    


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CatchExample().writeList();
	}
}
