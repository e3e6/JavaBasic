package com.sourceit.java.basic.lesson15.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties p = new Properties();
		BufferedInputStream buffer = null;
		try {
			buffer = new BufferedInputStream(new FileInputStream("settings.properties"));
			p.load(buffer);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(buffer != null)
				try {
					buffer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		System.out.println("Value of [language] = " + p.getProperty("language"));
		
		p.setProperty("new", "someNewValue");
		
		try {
			p.store(new FileOutputStream("settings.properties" ) , "comments");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
