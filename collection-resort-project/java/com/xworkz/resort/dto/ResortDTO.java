package com.xworkz.resort.dto;

public class ResortDTO {
	private String name;
	private String location;
	private double pricePerHead;
	private float rating;
	private long phoneNO;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;
	private boolean poolExist;
	private int noOfRooms ;
	
	
	public ResortDTO(String name, String location, String managerName, int noOfRooms) {
		super();
		this.name = name;
		this.location = location;
		this.managerName = managerName;
		this.noOfRooms = noOfRooms;
	}
	
	
	@Override
	public String toString() {
		return "ResortDTO [name=" + name + ", location=" + location + ", pricePerHead=" + pricePerHead + ", rating="
				+ rating + ", phoneNO=" + phoneNO + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + ", poolExist=" + poolExist + ", noOfRooms=" + noOfRooms + "]";
	}


	public double getPricePerHead() {
		return pricePerHead;
	}
	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public long getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(long phoneNO) {
		this.phoneNO = phoneNO;
	}
	public boolean isOffers() {
		return offers;
	}
	public void setOffers(boolean offers) {
		this.offers = offers;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public boolean isPoolExist() {
		return poolExist;
	}
	public void setPoolExist(boolean poolExist) {
		this.poolExist = poolExist;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getManagerName() {
		return managerName;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	
	

}
