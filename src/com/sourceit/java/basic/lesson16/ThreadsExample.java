package com.sourceit.java.basic.lesson16;

public class ThreadsExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.nanoTime();
		
		
		System.out.println("start");

		Thread t = new Thread(new RunnableEx());
		t.start();
		
		t.join();
		
		System.out.println("end @" + (System.nanoTime() - startTime) + " nano.");
	}

}

class RunnableEx implements Runnable {
	 
    public void run() {
    	System.out.println("start - RunnableEx");
		
		
		
		System.out.println("end - RunnableEx");
    }
}