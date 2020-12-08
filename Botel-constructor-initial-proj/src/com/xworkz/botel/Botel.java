package com.xworkz.botel;

public class Botel {
	
	private String color;
	private float capacity;
	private String shape;
	private double price;
	private String brand;
	
	public Botel(String color, float capacity,String shape,double price,String brand) {
		this.color=color;
		this.capacity=capacity;
		this.shape=shape;
		this.price=price;
		this.brand=brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public float getCapacity() {
		return capacity;	
	}
	public void setCapacity(float capacity) {
		this.capacity=capacity;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape=shape;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
}
