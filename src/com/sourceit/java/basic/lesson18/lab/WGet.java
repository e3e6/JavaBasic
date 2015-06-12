package com.sourceit.java.basic.lesson18.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WGet {

	public static void main(String[] args) {
		 URL url;
		    InputStream is = null;
		    BufferedReader br;
		    String line;
		    StringBuilder sb = new StringBuilder();
		    try {
		        url = new URL("http://www.example.com/");
		        is = url.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        
		       
		        while ((line = br.readLine()) != null) {
		        	sb.append(line);
		        }
		    }catch(Exception ex){
		    	System.out.println("Smth. wrong: " + ex);
		    	return;
		    } finally {
		    	if (is != null){
		    		try {
						is.close();
					} catch (IOException e) {}
		    	}
		    }
		    
		    //Find all the links
		    String htmlPage = sb.toString();
		    
		    String[] links = htmlPage.split("http://");
		    
		    for(String str: links){
		    	System.out.println(str);
		    }
	}

}
