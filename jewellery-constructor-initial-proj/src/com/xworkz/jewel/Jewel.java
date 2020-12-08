package com.xworkz.jewel;

public class Jewel {

	private String name;
	private String design;
	private double price;
	
	public Jewel(String name,String design,double price) {
		this.name=name;
		this.design=design;
		this.setPrice(price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design=design;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
