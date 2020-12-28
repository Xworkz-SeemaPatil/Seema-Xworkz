package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.artgallery.MonumentOperation;
import com.xworkz.xworkzapp.artgallery.MonumentsDTO;


public class MonumentUtil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of monuments");
		int size = sc.nextInt();
		MonumentOperation operation = new MonumentOperation(size);

		for (int i = 0; i < size; i++) {
			MonumentsDTO dto = new MonumentsDTO();
			System.out.println("Enter the" + " " + (i + 1) + " " + "monument Details");
			System.out.println("Enter the monument id");
			int id = sc.nextInt();
			System.out.println("Enter the monument name");
			String name = sc.next();
			
			dto.setId(id);
			dto.setName(name);
			
			operation.addMonuments(dto);
		}
		 operation.displayMonument();
		 sc.close();
	 
		}
}
