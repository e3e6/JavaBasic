package com.sourceit.java.basic.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map<Integer, String> someMap = new HashMap<>();
		
		
		someMap.put(44, "Kiev");
		someMap.put(57, "Kharkiv");
		someMap.put(62, null);
//		someMap.put("SomeCity", 666);
		
		
		System.out.println("City name:" + someMap.get(057));
		System.out.println("City name:" + someMap.get("Kiev") );
		System.out.println("City name:" + someMap.get(062));
		
		
		Set pairs = someMap.entrySet();
		
		System.out.println(someMap.entrySet());
		
	}
	
	private static Object getMapValue(Object key, Map map){
		if(!map.containsKey(key)){
			return "<Key not found>";
		}
		
		return map.get(key);
	}

}
