package com.sourceit.java.basic.Lesson11;

import java.util.Iterator;

public class IterableTest implements Iterable {
	
	private Integer first;
	private Integer second;

	public IterableTest(Integer first, Integer second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public Iterator iterator() {
		return new IterableTestIterator();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IterableTest tt = new IterableTest(10, 13);
		
		for(Object o: tt){
			System.out.println(o);
		}
	}
}





class IterableTestIterator implements Iterator {
	
	public IterableTest iter;
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}