package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstaDAO;
import com.xworkz.instagram.dao.InstaDAOImpl;
import com.xworkz.instagram.entity.InstaEntity;

public class GetTester {
public static void main(String[] args) {
		
		InstaDAO dao=new InstaDAOImpl();
		InstaEntity entity=dao.getById(1);
		System.out.println(entity.getName());
		System.out.println(entity);
		System.out.println("successfully get the matched id");

		
		
	}

}
