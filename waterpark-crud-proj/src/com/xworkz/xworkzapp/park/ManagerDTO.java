package com.xworkz.xworkzapp.park;

public class ManagerDTO {
	private String name;
	private long number;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public ManagerDTO(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}

}
