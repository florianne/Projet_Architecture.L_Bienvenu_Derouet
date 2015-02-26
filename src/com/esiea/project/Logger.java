package com.esiea.project;

public class Logger extends Formateur{

	private Class<?> name;
	private Level level;
	private String message;
	
	// -----------------------------//
		
	
	
	// ------------------------------//

	public Logger(Class<?> name){
		this.name=name;
		
		
	}	
	
	public Class<?> getName(){
		return this.name;
	}
	
	
		
	public void setLevel(Level level){
		System.out.println("AHHHHHHHHHHH "+level);
		System.out.println("AHHHHHHHHHHH "+this.level);

		this.level=level;
		System.out.println("BHHHHHHHHHHH "+level);
		System.out.println("BHHHHHHHHHHH "+this.level);
		
	}
		

	public Level getLevel(){
		System.out.println("level="+level);
		return level;
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	
	
	public void debug(String message){
		System.out.println("before="+level);
			Configuration.setLevel(Logger.class, Level.DEBUG);
			System.out.println("CHHHHHHHHHHH "+level);

			//Configuration.setLayout(Logger.class, new Formateur());

		System.out.println(message);
		
		return;
	}
	
	public void info(String message){
		//Configuration.setLevel(Logger.class, Level.INFO);

		//System.out.println(message);
		return;
	}
	
	public void error(String message){
		//Configuration.setLevel(OurLoggerClass.class, Level.ERROR);

		//System.out.println(message);
		return; 
	}
	
	
}
