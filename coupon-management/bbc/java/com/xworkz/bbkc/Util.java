package com.xworkz.bbkc;

import com.xworkz.bbkc.dao.BBCDAO;
import com.xworkz.bbkc.dao.BBCDAOImpl;
import com.xworkz.bbkc.entity.BBCEntity;

public class Util {
	public static void main(String[] args) {
		BBCDAO dao =new BBCDAOImpl();
		BBCEntity entity=dao.getById(1);//get method return type will depend on what we pass the parameter 1 
		System.out.println(entity.getName());
		System.out.println(entity);
		System.out.println("successfully get the matched id");
	}

}
