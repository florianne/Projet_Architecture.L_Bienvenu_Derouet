package com.esiea.project;

public class Logger {

	private Class<?> name;
	private String level;
	private String message;
	
	

	public Logger(Class<?> name){
		this.name=name;
	}	
	
		
	public String setLevel(String level){
		return this.level=level;
	}
		
	
	public String getLevel(){
		return level;
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	
	
	public void debug(String message){
		System.out.println(message);
		return;
	}
	
	public void info(String message){
		System.out.println(message);
		return;
	}
	
	public void error(String message){
		System.out.println(message);
		return; 
	}
	
	
}
