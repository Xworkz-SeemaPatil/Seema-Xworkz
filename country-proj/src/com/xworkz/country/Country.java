package com.xworkz.country;

public class Country {
	private String Captial;
	private long population;
	private int noOfStates;
	
	//public Country(String captial, long population, int noOfStates) {
		//Captial = captial;
		//this.population = population;
		//this.noOfStates = noOfStates;
	//}

	public String getCaptial() {
		return Captial;
	}

	public void setCaptial(String captial) {
		Captial = captial;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	
}
