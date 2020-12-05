package com.xworkz.pizza;

public class PizzaHut {
	// instance variables
	public String address;
	public String typeOfPizzas;
	public double price;

	public PizzaHut() {

		this("jay nagar", "pastapizza");
		System.out.println("ending with zero-param const");

	}

	public PizzaHut(String address, String typeOfPizzas) {

		this.address = address;
		this.typeOfPizzas = typeOfPizzas;
		System.out.println("ending with two-param const");

	}

	public PizzaHut(double price) {
		this();
		System.out.println("inside with o-param const");
		this.price = price;
	}

}
