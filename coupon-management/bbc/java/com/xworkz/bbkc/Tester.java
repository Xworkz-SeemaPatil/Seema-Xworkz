package com.xworkz.bbkc;

import com.xworkz.bbkc.dao.BBCDAO;
import com.xworkz.bbkc.dao.BBCDAOImpl;
import com.xworkz.bbkc.entity.BBCEntity;

public class Tester {
	public static void main(String[] args) {
		BBCEntity bbc = new BBCEntity();
		bbc.setId(1);
		bbc.setName("nidhi");
		bbc.setGender("female");
		bbc.setContestantType("actress");
		bbc.setDaysIn(2);
		bbc.setSeasonNo(8);
		bbc.setNoOfTask(1);
		
		BBCEntity bbc1 = new BBCEntity();
		bbc1.setName("vishwanath");
		bbc1.setGender("male");
		bbc1.setContestantType("singer");
		bbc1.setDaysIn(2);
		bbc1.setSeasonNo(8);
		bbc1.setNoOfTask(1);
		
		BBCDAO dao = new BBCDAOImpl();
		dao.create(bbc);
		dao.create(bbc1);
		System.out.println("created successfully");
		
	}
}
