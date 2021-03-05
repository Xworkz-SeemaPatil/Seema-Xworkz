package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstaDAO;
import com.xworkz.instagram.dao.InstaDAOImpl;
import com.xworkz.instagram.entity.InstaEntity;

public class CreateTester {
	public static void main(String[] args) {
		
	InstaEntity entity = new InstaEntity();
	//entity.setWId(1);
	entity.setUsrName("Seema_patil");
	entity.setName("seema");;
	entity.setNoOfPost(100);
	entity.setNoOfFollowers(1234);

	InstaDAO dao=new InstaDAOImpl();
	dao.create(entity);
	}
}
