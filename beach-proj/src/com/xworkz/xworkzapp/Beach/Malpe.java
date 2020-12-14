package com.xworkz.xworkzapp.Beach;

public class Malpe extends Beach{

	public Malpe(String place, int noOfCafe, int noOfBoats) {
		super(place, noOfCafe, noOfBoats);
	}
	
	public void enjoy(int noOfCafe) {
		System.out.println("entering inside enjoy method of malpe");
		super.noOfCafe=noOfCafe;
		super.enjoyWithFriends();
		System.out.println("Ending enjoy method of malpe");
	}
	
	{
		int noOfCafe=56;
		String place ="5 km from udupi";
		super.noOfCafe=noOfCafe;
		super.place=place;
		System.out.println(noOfCafe);
	}

}
