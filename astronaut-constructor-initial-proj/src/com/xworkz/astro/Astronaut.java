package com.xworkz.astro;

public class Astronaut {
	
	private String name;
	private int id;
	private String stream;
	private int noOfDaysInSpace;
	
	public Astronaut(String name, int id, String stream, int noOfDaysInSpace) {
		this.name = name;
		this.id = id;
		this.stream = stream;
		this.noOfDaysInSpace = noOfDaysInSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getNoOfDaysInSpace() {
		return noOfDaysInSpace;
	}

	public void setNoOfDaysInSpace(int noOfDaysInSpace) {
		this.noOfDaysInSpace = noOfDaysInSpace;
	}
	
	
	

}
