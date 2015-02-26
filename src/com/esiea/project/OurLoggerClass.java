package com.esiea.project;


public class OurLoggerClass {

	private Logger logger = LoggerFactory.getLogger(OurLoggerClass.class);

	public void run() {

		logger.debug("Test log. debug");
		logger.info("Test log. info");
		logger.error("Test log. error");
	}
	
	/*
	Configuration.ajouterCible(OurLoggerClass.class, new ConsoleCible());
	*/
	
	
	
}
