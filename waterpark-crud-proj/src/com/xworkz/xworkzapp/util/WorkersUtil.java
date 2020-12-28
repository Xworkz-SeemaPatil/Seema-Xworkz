package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.park.WorkersDTO;
import com.xworkz.xworkzapp.waterapark.WaterPark;

import java.util.Scanner;

public class WorkersUtil {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of worker details:");
		int size =sc.nextInt();
		WaterPark park = new WaterPark(size);
		
		for(int i=0;i<size;i++) {
			WorkersDTO dto = new WorkersDTO();
			System.out.println("enter the"+(i+1)+"worker information");
			System.out.println("enter the worker name");
			String name =sc.next();
			System.out.println("enter the worker id");
			int id = sc.nextInt();
			
			dto.setName(name);
			dto.setId(id);
			System.out.println(dto.getName()+dto.getId());
			
			park.addWorkers(dto);
		}

		sc.close();
		//WaterPark waterPark = new WaterPark();
		
		//WorkersDTO dto = new WorkersDTO();
		//dto.setName("radhe");
		//dto.setId(123);
		//WorkersDTO dto1 = new WorkersDTO();
		//dto1.setName("rohit");
		//dto1.setId(456);

		//waterPark.workers = new WorkersDTO[2];
		//waterPark.addWorkers(dto);
		//waterPark.addWorkers(dto1);

		//waterPark.showWorkersByName("radhe");
	}

}
