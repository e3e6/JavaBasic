package com.sourceit.java.basic.lesson15.enums;

import java.util.Date;

public class Season<T> {

	private T currentSeason = null;
	

	public static void main(String[] args) {
		Season<String> s = new Season<>();		
		
		Date date = new Date();		
		if(date.getMonth() == 0){
			s.currentSeason = SeasonsString.WINTER ;
		}
	}
}


interface SeasonsString {
	public static final String WINTER = "spring";
	public static final String SPRING = "spring";
	public static final String SUMMER = "summer";
	public static final String AUTUMN = "autumn";
}

interface SeasonsInt {
	public static final int WINTER = 0;
	public static final int SPRING = 1;
	public static final int SUMMER = 2;
	public static final int AUTUMN = 3;
}