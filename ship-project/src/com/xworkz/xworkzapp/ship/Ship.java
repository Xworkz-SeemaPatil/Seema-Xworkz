package com.xworkz.xworkzapp.ship;

public class Ship {
	private String shipName;
	private int shipId;
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	
	

	@Override
	public String toString() {
		return "Ship [shipName=" + shipName + "]";
	}
	
	
	@Override
	public int hashCode() {
		return (int)shipId;
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
		else if(this.shipName.equals(obj)) {
			return true;
		}
		
		return false;

	}
}
