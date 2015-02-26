package com.esiea.project;

public class Logger{

	private Class<?> name;
	private Level level = Level.DEBUG;
	private String message;
	
	// -----------------------------//
	
	
	// ------------------------------//

	public Logger(Class<?> name){
		//System.out.println("name:"+name);
		this.name=name;
		
	}	
	
	public Class<?> getName(){
		return this.name;
	}
	
	
		
	public void setLevel(Level level){
	
		this.level=level;
	
	}
		

	public Level getLevel(){
		//System.out.println("level="+level);
		return level;
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	
	
	public void debug(String message){
			level=Level.DEBUG;
			
			Configuration.setLevel(OurLoggerClass.class, Level.DEBUG);
			Configuration.setLayout(OurLoggerClass.class, new Formateur(), Level.DEBUG);

		System.out.println(message+"]");
		Configuration.setLevel(OurLoggerClass.class, Level.INFO);
		Configuration.setLayout(OurLoggerClass.class, new Formateur(), Level.INFO);
		System.out.println(message+"]");
		Configuration.setLevel(OurLoggerClass.class, Level.ERROR);
		Configuration.setLayout(OurLoggerClass.class, new Formateur(), Level.ERROR);
		System.out.println(message+"]\n");

		return;
	}
	
	public void info(String message){
		level=Level.INFO;
		Configuration.setLevel(Logger.class, Level.INFO);
		Configuration.setLayout(OurLoggerClass.class, new Formateur(), Level.INFO);

		System.out.println(message+"]");
		Configuration.setLevel(OurLoggerClass.class, Level.ERROR);
		Configuration.setLayout(OurLoggerClass.class, new Formateur(),Level.ERROR);


		System.out.println(message+"]\n");
		return;
	}
	
	public void error(String message){
		level=Level.ERROR;
		Configuration.setLevel(OurLoggerClass.class, Level.ERROR);
		Configuration.setLayout(OurLoggerClass.class, new Formateur(),Level.ERROR);


		System.out.println(message+"]\n");
		
		return; 
	}
	
	
}
