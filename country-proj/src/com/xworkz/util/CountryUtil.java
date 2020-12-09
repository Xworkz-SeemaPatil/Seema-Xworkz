package com.xworkz.util;

import com.xworkz.country.India;

public class CountryUtil {
	public static void main(String[] args) {
		//India india = new India("New Delhi",98765432345l,30);
		India india = new India();
		
		//india.capital="new delhi";
		//india.population=987654456l;
		//india.states=28;
		//System.out.println(india.population+ " "+india.capital+" "+india.states);
		
		india.setCaptial("kolkata");
		india.setNoOfStates(28);
		india.setPopulation(34567);
		System.out.println(india.getCaptial()+" "+india.getNoOfStates()+" "+india.getPopulation());
		
	}

}
