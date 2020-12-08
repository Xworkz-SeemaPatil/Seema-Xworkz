package com.xworkz.church;

public class Church {
	
	private String name;
	private String address;
	private int noOfFathers;
	

	public Church(String name, String address, int noOfFathers) {
	
		this.name = name;
		this.address = address;
		this.noOfFathers = noOfFathers;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getNoOfFathers() {
		return noOfFathers;
	}
	
	public void setNoOfFathers(int noOfFathers) {
		this.noOfFathers = noOfFathers;
	}
	
	
	

}
