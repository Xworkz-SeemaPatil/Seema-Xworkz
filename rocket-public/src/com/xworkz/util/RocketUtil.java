package com.xworkz.util;

import java.util.Date;

import com.xworkz.rocket.Rocket;

public class RocketUtil {
	
	
	public static void main(String[] args) {
		
		Rocket rocket=new Rocket("PSLV",567);
		rocket.date=new Date();
		
		System.out.println(rocket.id+ " "+rocket.name+" "+rocket.date);
	}

}

