package com.sourceit.java.basic.Lesson11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsLesson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printIt(Arrays.asList(args));
	}
	
	public static void printAll(Collection coll){
		for(Object o: coll){
			System.out.print(o + ",");
		}
	}
	
	public static void printIt(Collection coll){
		Iterator it = coll.iterator();
		it.next();
		
		while(it.hasNext()){
			System.out.print(it.next()+ ",");
		}
		
		it.next();
	}

}