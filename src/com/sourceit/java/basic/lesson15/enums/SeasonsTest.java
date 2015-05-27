package com.sourceit.java.basic.lesson15.enums;

import java.util.Date;
import java.lang.Enum;

public class SeasonsTest {

	Seasons currentSeason = null;
	

	public static void main(String[] args) {
		SeasonsTest s = new SeasonsTest();		
		
		Date date = new Date();		
		if(date.getMonth() == 4){
			s.currentSeason = Seasons.WINTER;
			
			System.out.println(s.currentSeason);			
			switch (s.currentSeason) {
				case WINTER:
				
					break;
				
				case SPRING:
					
					break;
			}
		}
	}

}

