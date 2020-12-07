package com.xworkz.util;

import com.xworkz.galaxy.*;

public class GalaxyUtil {

public static void main(String[] args) {
	
	Galaxy gal=new Galaxy();
	gal.setName("Milkyway Galaxy");
	gal.setNoOfPlanets(9);
	
	System.out.println(gal.getName()+" "+gal.getNoOfPlanets());
	
	
}
}
