package com.sourceit.java.basic.Lesson11;

import java.util.*;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Collection coll = new Collection(); //can't create an instance of interface
//		Set someSet = new Set();
		System.out.println("SetExample");
		HashSet someHashSet = new HashSet();

		
		LinkedHashSet someLinkedHashSet = new LinkedHashSet();
		TreeSet someTreeSet = new TreeSet();
//		someHashSet.
		
		someHashSet.add(10);
		someHashSet.add(20);
		someHashSet.add("aa");
		
		someHashSet.iterator();
		
		
		CollectionsLesson.printAll(someHashSet);
	}
}
