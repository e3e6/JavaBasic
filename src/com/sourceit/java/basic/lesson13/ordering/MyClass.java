package com.sourceit.java.basic.lesson13.ordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static com.sourceit.java.basic.utils.Utils.debug;

public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Name> names = new ArrayList<Name>();
					names.add(new Name("Pete","A"));
					names.add(new Name("Anna","A"));
					names.add(new Name("John","B"));
	
		Collections.sort(names);

		debug(names);
	}

}


//class Name {
//	String firstName;
//	String lastName;
//
//	public Name(String firstName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//}




class Name implements Comparable<Name> {
	String firstName;
	String lastName;


	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int compareTo(Name n) {
		 int lastCmp = lastName.compareTo(n.lastName);
	        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
//	
//	@Override
	public String toString() {
		return firstName;
	}
}