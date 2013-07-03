package com.example.myfirstapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class CommBean_2 {
	String action;
	HashMap<String, String> data = new HashMap<String, String>();
	
	//constructor
	public CommBean_2(String action){
		this.action = action;
	}
	// Over loaded constructor
	public CommBean_2(String action, HashMap<String, String> data){
		this.action = action;
		this.data = data;
	}
	
	// Http request
	public static void execHttp(String u){
		try {
			  URL url = new URL(u);
			  HttpURLConnection con = (HttpURLConnection) url
			    .openConnection();
			  	readStream(con.getInputStream());
			  } catch (Exception e) {
				  e.printStackTrace();
			}
	}
	
	private static void readStream(InputStream in) {
		  BufferedReader reader = null;
		  try {
		    reader = new BufferedReader(new InputStreamReader(in));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		      System.out.println(line);
		    }
		  } catch (IOException e) {
		    e.printStackTrace();
		  } finally {
		    if (reader != null) {
		      try {
		        reader.close();
		      } catch (IOException e) {
		        e.printStackTrace();
		        }
		    }
		  }
		} 
	
	public static int sendBean(){
		return 0;
		//hashmap of handlers (get me handler for this command)
	}
}
