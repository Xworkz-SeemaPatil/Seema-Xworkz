package com.dev.devapp.util;

import com.dev.devapp.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		//SteelIndustry industry = new SteelIndustry("construction",11,"white field"); //construction initialization
		//industry.area="Balle pet"; //String
		//industry.noOfWorkers=234;
		//industry.type="manufacturing";
		//System.out.println(industry.area+" "+industry.noOfWorkers+" "+industry.type);
		
		SteelIndustry industry = new SteelIndustry();
		industry.setArea("HSR Layout");
		industry.setNoOfWorkers(22);
		industry.setType("Sales");
		
		
		System.out.println(industry.getType()+" "+industry.getNoOfWorkers()+" "+industry.getArea());
	}

}
