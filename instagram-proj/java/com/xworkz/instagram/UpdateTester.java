package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstaDAO;
import com.xworkz.instagram.dao.InstaDAOImpl;

public class UpdateTester {
	public static void main(String[] args) {
		InstaDAO dao=new InstaDAOImpl();
		dao.UpdateUserNameAndNameById("see_patil", "seema patil", 1);
	}
}
