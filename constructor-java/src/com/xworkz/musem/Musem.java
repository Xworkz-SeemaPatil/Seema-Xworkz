package com.xworkz.musem;

public class Musem {
	//instance members
	public int id;
	public String name;
	public String address;
	public int noOfFloors;
	public String department;
	
	public Musem() {
		System.out.println("musem cont with no arg created ");
	}
	
	public Musem(int id, String name,String address,int noOfFloors,String department){
		
		System.out.println("musem cont with  arg created ");
		this.id=id;
		this.name=name;
		this.address=address;
		this.noOfFloors=noOfFloors;
		this.department=department;
		
	}
	

}
