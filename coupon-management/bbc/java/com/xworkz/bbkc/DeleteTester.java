package com.xworkz.bbkc;

import com.xworkz.bbkc.dao.BBCDAOImpl;
public class DeleteTester {
	public static void main(String[] args) {
		new BBCDAOImpl().deleteById(2);
		
	}
}
