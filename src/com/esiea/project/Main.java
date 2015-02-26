package com.esiea.project;

import java.util.logging.*;

public class Main {

	static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		Configuration.ajouterCible(Main.class, new ConsoleCible());
		Configuration.ajouterCible(Main.class, new FileCible("./file.txt"));
		Configuration.setLayout(Main.class, new Formateur());
		Configuration.setLevel(Main.class, DEBUG);

		logger.debug("Test log. debug");
		logger.info("Test log. info");
		logger.error("Test log. error");
	}
}
