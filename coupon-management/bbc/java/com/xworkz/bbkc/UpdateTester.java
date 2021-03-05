package com.xworkz.bbkc;

import com.xworkz.bbkc.dao.BBCDAOImpl;
import com.xworkz.bbkc.entity.BBCEntity;

public class UpdateTester {
	public static void main(String[] args) {
		BBCEntity entity=new BBCDAOImpl().updateDaysInAndNoOfTasksById(1, 4, 50);
		System.out.println(entity);
	}
}
