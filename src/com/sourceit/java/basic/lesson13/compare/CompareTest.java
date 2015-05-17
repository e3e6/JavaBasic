package com.sourceit.java.basic.lesson13.compare;

import static com.sourceit.java.basic.utils.Utils.debug;

public class CompareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		
		debug(a == b);
		
		String name = "Mr. Smith";
		
		Name n1 = new Name(name);
		Name n2 = new Name(name);
		
		debug(n1 == n2);
		
		String str1 = "str";
		String str2 = "str";
		
		debug(str1 == str2);
		debug("str" == "str");
		
		debug("ints = " + compare(1000, 1000));
		
		debug(new String("str") == new String("str"));
		
		
		debug("equals ints = " + new Integer(100).equals(new Integer(100)));
		
		Name s1 = new Name("Mr. Smith");
		Name s3 = s1;
		Name s2 = new Name("Mr. Smith");
		
		s3.name = "wdwdwd";
		
		
		debug("s1 = " + s1);
		
		debug("== Name = " + (s1 == s2));
		debug("equals 3 = " + (s1 == s3));
		debug("equals Name = " + s1.equals(s2));
	}
	
	static boolean compare(Integer i1, Integer i2){
		return i1 == i2;
	}
}

class Name {
	String name;

	public Name(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		return name.equals(((Name)obj).name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}