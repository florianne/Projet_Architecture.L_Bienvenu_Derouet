package com.esiea.project;

public class LoggerFactory {

	public static Logger getLogger(Class<?> class1) {
		
		Logger logger = new Logger(class1);
		
		return logger;
	}

}
