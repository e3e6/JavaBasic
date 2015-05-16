package com.sourceit.java.basic.lesson13.ordering;

import static com.sourceit.java.basic.utils.Utils.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Sort by other field
 * @author alex
 *
 */
public class OrderCustom {
	
	public static void main(String[] args) {
		
		User[] names = {new User(1, "Pete","V"),
						new User(2, "John","C"),
						new User(3, "John","C")};
	
		List<User> list = Arrays.asList(names);
		
		Collections.sort(list); //Natural ordering
		
		debug(list); 
		
		
		//sorted by ID
		Collections.sort(list, User.COMPARE_BY_ID);
		debug(list); 
	}
	

	
}



class User implements Comparable<User> {
	String firstName;
	String lastName;
	Long id;


	public User(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int compareTo(User n) {
		 int lastCmp = lastName.compareTo(n.lastName);
	        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
	
	@Override
	public String toString() {
		return firstName;
	}
	
	static Comparator<User> COMPARE_BY_ID = new Comparator<User>(){
		
		public int compare(User o1, User o2) {
			return o1.id.compareTo(o2.id);
		}
	};
}





class SortUserById implements Comparator<User> {

	public int compare(User o1, User o2) {
		return o1.id.compareTo(o2.id);
	}
	
}