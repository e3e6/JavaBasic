package com.sourceit.java.basic.lesson17.concurrency;

public class RaceExample {
	protected static final int INCREMENT_COUNT = 1000;
	protected static final int DECREMENT_COUNT = 999;
	static Counter c = new Counter();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < INCREMENT_COUNT; i++){
					c.increment();
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < DECREMENT_COUNT; i++){
					c.decrement();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Count = " + c.value());
	}

}

class Counter {
    private Integer c = 0;
    private Integer a = 0;
    
    public void increment() {
    	Integer e;
    	synchronized (c) {
    		

    		synchronized (a) {
        		e = a + c;
    		}
		}
        
    }

    public void decrement() {
    	synchronized (a) {
    		a--;
		}
    }

    public int value() {
        return c;
    }
}

