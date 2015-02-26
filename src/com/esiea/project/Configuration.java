package com.esiea.project;

public class Configuration {
/*	public static void ajouterCible(Class<Main> class1, Cible cible){
	}*/

	public static void setLevel(Class<?> class1, Level level){
		//System.out.println(level);

		System.out.println(level);
		LoggerFactory.getLogger(class1).setLevel(level);
		LoggerFactory.getLogger(class1).setMessage("LALALAALALALALALALALALALALALA");

		System.out.println(level);
		
		//System.out.println("ENCULE="+LoggerFactory.getLogger(class1).getLevel());
		//	System.out.println(level.getLevel());

	}
	
	public static void setLayout(Class<?> class1, Formateur formateur){
		formateur.getFormate(LoggerFactory.getLogger(class1)); 
	}
	
}