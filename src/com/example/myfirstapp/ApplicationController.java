package com.example.myfirstapp;

import java.util.HashMap;


public class ApplicationController {
	private HashMap<String, Handler> commMap;
	
	public ApplicationController(){
		commMap = new HashMap<String, Handler>();
		commMap.put("getPivots", new GetPivots());
	}
	
	public void handleRequest (String command, HashMap<String, String> data){
		Handler aHandler = commMap.get(command);
		aHandler.handleIt(data);
	}
}
