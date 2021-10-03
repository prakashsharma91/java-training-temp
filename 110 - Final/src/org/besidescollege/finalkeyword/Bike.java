package org.besidescollege.finalkeyword;

public class Bike {
	
	final String engineCapacity;
	final Integer speedlimit=90;  
	
	Bike(){
		engineCapacity = "100cc";
		// speedlimit=100; 
	}
	
	public void setSpeedLimit() {
		// speedlimit = 100;
	}

	public Integer getSpeedlimit() {
		return speedlimit;
	}
	
	public void setEngineCapacity() {
		// engineCapacity = "100cc";
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}
}
