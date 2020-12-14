package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.ott.Netflix;
//import com.xworkz.xworkzapp.ott.Prime;

public class OttUtil {
	public static void main(String[] args) {
		
		
		 Netflix net = new Netflix("Monthly Subcription",200,"Seema");
		 System.out.println(net.typeOfSubcription+" "+net.price+" "+net.userName);
		 net.watchingWebSeriesAtWeekend(); net.timePass("seema");
	
	    //Prime prime = new Prime();
		//System.out.println(prime);
	}
}
