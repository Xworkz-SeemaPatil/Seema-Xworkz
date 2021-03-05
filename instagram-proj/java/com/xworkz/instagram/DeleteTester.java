package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstaDAO;
import com.xworkz.instagram.dao.InstaDAOImpl;
 
public class DeleteTester {
	public static void main(String[] args) {
		InstaDAO dao=new InstaDAOImpl();
		dao.deleteById(2);
	}

}
