package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;

public class DeleteTester {
	public static void main(String[] args) {
		WaterFallDAO dao=new WaterFallDAOImpl();
		dao.deleteById(2);
	}
}
