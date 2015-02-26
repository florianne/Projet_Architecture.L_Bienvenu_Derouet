package com.esiea.project;

public class Logger extends Formateur{

	private Class<?> name;
	private Level level;
	private String message;
	
	// -----------------------------//
		
	public void setMessage(String message){
		/*	System.out.println("AHHHHHHHHHHH "+level);
			System.out.println("AHHHHHHHHHHH "+this.level);
	*/
			this.message=message;
		/*	System.out.println("BHHHHHHHHHHH "+level);
			System.out.println("BHHHHHHHHHHH "+this.level);
			*/
		}
	
	
	// ------------------------------//

	public Logger(Class<?> name){
		this.name=name;
		
		
	}	
	
	public Class<?> getName(){
		return this.name;
	}
	
	
		
	public void setLevel(Level level){
	/*	System.out.println("AHHHHHHHHHHH "+level);
		System.out.println("AHHHHHHHHHHH "+this.level);
*/
		this.level=level;
	/*	System.out.println("BHHHHHHHHHHH "+level);
		System.out.println("BHHHHHHHHHHH "+this.level);
		*/
	}
		

	public Level getLevel(){
		System.out.println("level="+level);
		return level;
	}
	
	
	
	public String getMessage(){
		return message;
	}
	
	
	
	public void debug(String message){
		System.out.println("AAAAAAAA="+level);
			Configuration.setLevel(OurLoggerClass.class, Level.DEBUG);
			System.out.println("BBBBBB="+level);

			Configuration.setLayout(OurLoggerClass.class, new Formateur());

		System.out.println(message+"]");
		
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
