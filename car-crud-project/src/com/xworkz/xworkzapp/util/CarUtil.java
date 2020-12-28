package com.xworkz.xworkzapp.util;

import java.util.Scanner;


import com.xworkz.xworkzapp.dto.CarDTO;
import com.xworkz.xworkzapp.car.CarShowroom;

public class CarUtil {
	public static void main(String[] args) {
		//CarShowroom showroom = new CarShowroom();
		/* CarDTO car =new CarDTO();
	    car.setName("BMW");
	    
	    CarDTO car1 =new CarDTO();
	    car1.setName("i20");
	    
	    CarDTO car2=new CarDTO();
	    car2.setName("Dezire");
	    
	    CarDTO car3=new CarDTO();
	    car3.setName("swift");
	    
	    CarDTO car4=new CarDTO();
	    car4.setName("lambrgini");
	    

		showroom.addCars(car);
		showroom.addCars(car1);
		showroom.addCars(car2);
		showroom.addCars(car3);
		showroom.addCars(car4);
		
		showroom.displayCars();
		
		showroom.displayCarByName("swift"); */
		

		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no of Car showroom you want to add ");
		int size =sc.nextInt();
		CarShowroom showroom = new CarShowroom(size);
		for(int i=0;i<size;i++) {
			CarDTO dto =new CarDTO();
			System.out.println("Enter the" +" " +(i+1)+" "+"car showroom Details");
			System.out.println("Enter the Car name");
			String name = sc.next();
			System.out.println("enter the price");
			double price =sc.nextDouble();
			
			dto.setName(name);
			dto.setPrice(price);
			
			showroom.addCars(dto);
			}
	
		showroom.displayCars();
		
		System.out.println("enter the car name u want to search");
	    String name=	sc.next();
		showroom.displayCarByName(name);
		//System.out.println(carDTO);
		
		System.out.println("enter the car price u want to search");
	    double price =	sc.nextDouble();
		showroom.displayCarByPrice(price);
		//System.out.println(carDTO);
		
		System.out.println("enter the car name u want to delete");
	    String name1 =	sc.next();
		showroom.deletCarByName(name1);
		
		showroom.displayCars();
		
		System.out.println("enter the car name u want to update price");
	    String name2 =	sc.next();
	    System.out.println("enter new price");
	    double price1 =	sc.nextDouble();
		
		showroom.updateCarPriceByName(name2, price1);
		
		showroom.displayCars();
		}
			
}
