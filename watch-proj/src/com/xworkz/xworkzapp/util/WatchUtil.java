package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.Rolex;
import com.xworkz.xworkzapp.watch.Watch;

public class WatchUtil {
	
	public static void main(String[] args) {
		
		//up casting
		Watch watch = new Rolex();
		//down casting
		Rolex rolex=(Rolex)watch;
		//in one line
		//Rolex rolex =(Rolex) new Watch();
		
		watch.modelNo="RTA420";
		
		watch.price=5678.99;
		watch.displayTime();
		
		System.out.println(watch.modelNo +" "+watch.price);
	}

}
