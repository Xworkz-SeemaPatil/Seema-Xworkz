package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class GetTester {
	public static void main(String[] args) {
		
		WaterFallDAO dao=new WaterFallDAOImpl();
		WaterFallEntity entity=dao.getById(1);
		System.out.println(entity.getName());
		System.out.println(entity);
		System.out.println("successfully get the matched id");

		
		
	}
}
