package com.xworkz.xworkzapp.ott;

public class Ott {

	public String typeOfSubcription;
	public double price;
	public String userName;

	public Ott(String typeOfSubcription, double price, String userName) {
		this.typeOfSubcription = typeOfSubcription;
		this.price = price;
		this.userName = userName;
	}

	public void watchingWebSeriesAtWeekend() {
		System.out.println("completing 2 episodes");
	}
}
