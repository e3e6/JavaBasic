package com.sourceit.java.basic.lesson16;

import java.util.Date;

public class ThreadStartExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		new Thread(new RunnableExample()).start();
		new ThreadExample().start();
		
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new Date() + " - main");
		}
	}

}

class RunnableExample implements Runnable {

    public void run() {
    	while(true){
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println(new Date() + " - runnable");
    	}
    }
}

class ThreadExample extends Thread {

    public void run() {
    	while(true){
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println(new Date() + " - thread");
    	}

    }
}