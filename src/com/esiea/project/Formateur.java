package com.esiea.project;

import java.util.Date;
import java.text.DateFormat;

public class Formateur extends LoggerFactory{
	
	
	public void getFormate(Logger logger, Level level){
		
		
		Date aujourdhui = new Date();
		
	
		
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.MEDIUM,
		
		DateFormat.MEDIUM);
		
		
		System.out.print(mediumDateFormat.format(aujourdhui));
	
		
		System.out.print(" [NAME="+logger.getName());
	
		System.out.print(" | LEVEL="+level);
		
		System.out.print(" | MESSAGE=");

	}
	
}