package com.esiea.project;

public class Formateur extends LoggerFactory{
	
	
	public void getFormate(Logger logger, Level level){
		
		System.out.print("\n[NAME="+logger.getName());
	
		System.out.print(" | LEVEL="+level);
		
		System.out.print(" | MESSAGE=");

	}
	
}