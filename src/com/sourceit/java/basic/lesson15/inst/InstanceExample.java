package com.sourceit.java.basic.lesson15.inst;

public class InstanceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Name n = new Name("Vasya");
		
		boolean result = n.equals("Vasya");
		
		System.out.println(result);
	}

}



//class Name {
//	private String name;
//
//	public Name(String name) {
//		this.name = name;
//	}
//
//	public boolean equals(Object obj) {
//
//		return name.equals(((Name) obj).name);
//	}
//	
//	public String getName(){
//		return name;
//	}
//}



//
class Name {
	String name;

	public Name(String name) {
		this.name = name;
	}
	
	public boolean equals(Name obj) {
		if(obj instanceof Name){
			return name.equals(((Name)obj).name);
		}
		
		return false;
	}
}