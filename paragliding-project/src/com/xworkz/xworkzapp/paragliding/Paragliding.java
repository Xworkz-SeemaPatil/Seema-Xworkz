package com.xworkz.xworkzapp.paragliding;

public class Paragliding {
	private String place;
	private int height;
	private int id;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Paragliding() {
	
	}
	
	@Override
	public String toString() {
		return "Paragliding [place=" + place + "]";
	}
	
	
	@Override
	public int hashCode() {
		return (int)id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			if(this == obj) {
				return true;
			}
		 }
		if(obj == null)
		{
			System.out.println("object is null");
		}
		else if(this.hashCode() == obj.hashCode()) {
			return true;
		}
		else if(this.place.equals(obj)) {
			return true;
		}
		
		return false;
	}
	


}
