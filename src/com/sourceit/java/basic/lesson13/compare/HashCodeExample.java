package com.sourceit.java.basic.lesson13.compare;

import static com.sourceit.java.basic.utils.Utils.debug;

public class HashCodeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		debug("some string".hashCode());
		debug("some string".hashCode());
		
		Name2 n1 = new Name2("Mr. Smith");
		Name2 n2 = new Name2("Mr. Smith");
		
		debug("name = "  + n1.toString());
		debug("name = "  + n1.hashCode());
		debug("name2 = "  + n2.hashCode());
	}

}


class Name2 {
	String name;

	public Name2(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		return name.equals(((Name)obj).name);
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name;
//	}
}