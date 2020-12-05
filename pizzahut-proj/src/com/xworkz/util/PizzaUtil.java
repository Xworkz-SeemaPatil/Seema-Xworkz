package com.xworkz.util;
import java.util.Scanner;

import com.xworkz.pizza.*;

public class PizzaUtil {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the address");
		String address=sc.next();
		
		
		System.out.println("enter the types of pizza");
		String typesOfPizzas=sc.next();
		
		sc.close();
		
		PizzaHut pizzahut = new PizzaHut(address,typesOfPizzas);
		System.out.println(pizzahut.address);
		
		
	}
}
