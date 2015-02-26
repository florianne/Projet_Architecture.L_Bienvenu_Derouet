package com.esiea.project;
	
enum Level{
		
	DEBUG(1),
	INFO(2),
	ERROR(3);
	
	private int levelNumber;
	
	Level(int level){
		levelNumber = level;
	}
		
	public int getLevel(){
		return levelNumber;
	}
}
	
