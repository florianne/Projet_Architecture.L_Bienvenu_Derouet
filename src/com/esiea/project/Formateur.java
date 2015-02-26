package com.esiea.project;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Formateur extends LoggerFactory{
	
	
	public void getFormate(Logger logger, Level level){
		
		
		Date aujourdhui = new Date();
		
	
		
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
		DateFormat.MEDIUM,
		
		DateFormat.MEDIUM);
		
		
		DateFormat mediumDateFormatEN = DateFormat.getDateTimeInstance(
		
		DateFormat.MEDIUM,
		
		DateFormat.MEDIUM, new Locale("EN","en"));
	

		
		System.out.print(mediumDateFormat.format(aujourdhui));
	
		
		System.out.print(" [NAME="+logger.getName());
	
		System.out.print(" | LEVEL="+level);
		
		System.out.print(" | MESSAGE=");

	}
	
}