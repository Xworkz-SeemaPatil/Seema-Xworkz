package com.xworkz.xworkzapp.car;

import com.xworkz.xworkzapp.dto.CarDTO;

public class CarShowroom {

	// public CarDTO carDTO[] = new CarDTO[10];
	public CarDTO[] carDTO;
	public int currentIndex;

	public CarShowroom(int size) {
		carDTO = new CarDTO[size];
		System.out.println("Showroom object created");
	}

	public boolean addCars(CarDTO carDTO) {
		boolean added = false;
		if (carDTO != null) {
			System.out.println(this.currentIndex);
			this.carDTO[currentIndex] = carDTO;
			this.currentIndex++;
			added = true;
			return added;
		} else if (carDTO == null) {
			added = false;
			System.out.println("car dto is not added");
		}
		return added;
	}

	public CarDTO displayCars() {
		CarDTO carDTOs = null; // dummy variables
		System.out.println("showing car details");
		for (int i = 0; i < carDTO.length; i++)
			if (carDTO[i] != null) {
				carDTOs = carDTO[i];
				System.out.println(carDTO[i].getName() + "  " + carDTO[i].getPrice());
			} 
			else {
				System.out.println("end of showing car details");
			}
		return carDTOs;
	}

	public CarDTO displayCarByName(String name) {
		CarDTO carDTOs = null; // dummy variables
		System.out.println("showing car details");
		for (int i = 0; i < carDTO.length; i++)
			if (carDTO[i] != null) {
				if (carDTO[i].getName().equals(name)) {
					carDTOs = carDTO[i];
					System.out.println(carDTO[i].getName() + " car name is found");

				}
			}
		return carDTOs;
	}

	public CarDTO displayCarByPrice(double price) {
		CarDTO carDTOs = null; // dummy variables
		System.out.println("showing car price details");
		for (int i = 0; i < carDTO.length; i++)
			if (carDTO[i] != null) {
				if (carDTO[i].getPrice() == (price)) {
					carDTOs = carDTO[i];
					System.out.println(carDTO[i].getPrice() + " car price is found");

				}
			}
		return carDTOs;
	}

	public void deletCarByName(String name) {
		System.out.println("Starting with deleting by name");
		for (int i = 0; i < carDTO.length; i++)
			if (carDTO[i] != null) {
				if (carDTO[i].getName().equals(name)) {
					carDTO[i] = null;
				}
			}
	}

	public void updateCarPriceByName(String name, double price) {
		System.out.println("Starting with update by name");
		for (int i = 0; i < carDTO.length; i++)
			if (carDTO[i] != null) {
				if (carDTO[i].getName().equals(name)) {
					carDTO[i].setPrice(price);
					System.out.println("price updated");

				}
			}
	}

}