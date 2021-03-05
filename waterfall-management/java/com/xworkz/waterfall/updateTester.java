package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;

public class updateTester {
	public static void main(String[] args) {
		WaterFallDAO dao=new WaterFallDAOImpl();
		dao.updateHeightAndDeapthById(345,876,1);
	}
}
