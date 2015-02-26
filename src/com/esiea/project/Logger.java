package com.esiea.project;

public class Logger {

	private Class<?> name;
	private Level level;
	private String message;
	
	

	public Logger(Class<?> name){
		this.name=name;
	}	
	
		
	public Level setLevel(Level level){
		return this.level=level;
	}
		
	
	public Level getLevel(){
		return level;
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	
	
	public void debug(String message){
		Configuration.setLevel(OurLoggerClass.class, Level.DEBUG);
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
