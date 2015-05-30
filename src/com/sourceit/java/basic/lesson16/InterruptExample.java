package com.sourceit.java.basic.lesson16;

import java.util.Date;

public class InterruptExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(sleepR);
			   t1.start();

			   Thread.sleep(2000);
			   
			   t1.interrupt();

	}
	
	static Runnable waitR = new Runnable() {
		
		@Override
		public void run() {
			for(int i = 0; ; i++){
				System.out.println("[" + i + "]");
				
				if(Thread.interrupted()) {
					break;
				}
			}
		}
	};
	
	static Runnable sleepR = new Runnable() {
		
		@Override
		public void run() {
			System.out.println(new Date() + " > Begin Sleep");
			
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				System.out.println(new Date() + " > Thread interrupted. Exiting");
			}
		}
	};

}
