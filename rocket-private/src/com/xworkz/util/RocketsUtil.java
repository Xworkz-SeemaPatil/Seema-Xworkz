package com.xworkz.util;

import java.util.Date;

import com.xworkz.rockets.Rockets;

public class RocketsUtil {
	
	
	public static void main(String[] args) {
		
		Rockets rocket=new Rockets();
		rocket.setName("PSLV");
		rocket.setId(567);
		rocket.setDate(new Date());
		
		System.out.println(rocket.getId()+ " "+rocket.getName()+" "+rocket.getDate());
	}

}