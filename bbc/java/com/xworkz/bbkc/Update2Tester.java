package com.xworkz.bbkc;

import com.xworkz.bbkc.dao.BBCDAOImpl;
import com.xworkz.bbkc.entity.BBCEntity;

public class Update2Tester {
	public static void main(String[] args) {
		BBCEntity dao=new BBCDAOImpl().updateNameById("vaishnavi", 1);
		System.out.println(dao);
	}
}