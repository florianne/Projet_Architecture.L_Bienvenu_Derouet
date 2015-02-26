package com.esiea.project;

public class LoggerFactory {

	static Logger logger;
	
	public static Logger getLogger(Class<?> class1) {
		
		logger = new Logger(class1);
		
		return logger;
	}

}
