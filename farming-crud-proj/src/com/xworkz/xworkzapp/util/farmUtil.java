package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.farm.*;

public class farmUtil {
	public static void main(String[] args) {
		// FarmDTO farmOne =new FarmDTO("black","2 acre","peanuts");
		// FarmDTO farmTwo =new FarmDTO("red","3 acre","Cotton");
		// FarmDTO farmThree =new FarmDTO("brown","5 acre","Sunflower");
		// FarmDTO farmFour =new FarmDTO("laterite","50 acre","paddy");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the farm size");
		int size = sc.nextInt();
		Operation operation = new Operation (size);
		
		
		
		for (int i=0; i < size; i++) {
			FarmDTO dto =new FarmDTO();
			System.out.println("Enter the" +" " +(i+1)+" "+"Farm Details");
			System.out.println("Enter the Soil type");
			String typeOfSoil = sc.next();
			System.out.println("Enter the Area");
			String area = sc.next();
			System.out.println("Enter the Type of Crop");
			String typeOfCrop = sc.next();
			
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
	
			operation.addFarmDetails(dto);
		
		
		//operation.addFarmDetails(farmTwo);
		//operation.addFarmDetails(farmThree);
		//operation.addFarmDetails(farmFour);
		
	}
		
	operation.showAllFarmDetails();

	System.out.println("enter the crop u want to search");
    String crop=	sc.next();
	FarmDTO farmDTO = operation.showFarmDetailsByCrop(crop);
	System.out.println(farmDTO);
	
	System.out.println("enter the area u want to search");
    String area=	sc.next();
	FarmDTO farmDTO1 = operation.showFarmDetailsByArea(area);
	System.out.println(farmDTO1);
	
	System.out.println("enter the soil u want to search");
    String soil =	sc.next();
	FarmDTO farmDTO2 = operation.showFarmDetailsBySoil(soil);
	System.out.println(farmDTO2);
	
	sc.close();
	}
}