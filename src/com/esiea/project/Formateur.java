package com.esiea.project;

public class Formateur extends LoggerFactory{
	
	
	public void getFormate(Logger logger){
		
		System.out.print("\n[NAME="+logger.getName());
	
		System.out.print(" | LEVEL="+logger.getLevel());
		
		System.out.print(" | MESSAGE=");

	}
	
}