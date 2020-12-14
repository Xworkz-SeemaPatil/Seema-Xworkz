package com.xworkz.xworkzapp.icecream;

public class IceCream {
	
	private String type;
	private double cost;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public void healRemedy()
	{
		System.out.println("suggested by Dentist");
	}
}
