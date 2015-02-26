package com.esiea.project;

import java.util.logging.*;

public class Formateur {
	protected Logger logger;
	protected Level level;
	
	protected void setLevel(Level level){
		this.level = level;
	}
	protected void setLogger(Logger logger){
		this.logger = logger;
	}
	
}