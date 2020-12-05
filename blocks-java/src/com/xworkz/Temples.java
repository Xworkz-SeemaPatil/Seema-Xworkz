package com.xworkz;

public class Temples {
	 String templeName;
	 String timings;
	public static void main(String[] args) {
		
		Temples tem=new Temples();
		System.out.println(tem);		
		
	}
	//instance block or non-static block or init block or IIB (instance initialization block)
	{
		templeName="Ganesha Temple";
		timings="6:30 AM";
		System.out.println(templeName);
		System.out.println(timings);
		
	}

}
