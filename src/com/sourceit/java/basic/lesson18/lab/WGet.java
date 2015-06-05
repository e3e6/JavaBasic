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

		    try {
		        url = new URL("https://dl.dropboxusercontent.com/u/56274892/Java-Basic/index.html");
		        is = url.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        
		        while ((line = br.readLine()) != null) {
		            System.out.println(line);
		        }
		    }catch(Exception ex){
		    	System.out.println("Smth. wrong" + ex);
		    } finally {
		    	if (is != null){
		    		try {
						is.close();
					} catch (IOException e) {}
		    	}
		    }
	}

}
