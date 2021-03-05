package com.xworkz.instagram;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.instagram.dao.InstaDAO;
import com.xworkz.instagram.dao.InstaDAOImpl;
import com.xworkz.instagram.entity.InstaEntity;

public class ListTester {
	public static void main(String[] args) {
		InstaEntity entity=new InstaEntity();
		entity.setName("vaishu");
		entity.setUsrName("vai_patil");
		entity.setNoOfPost(12);
		entity.setNoOfFollowers(23234);
		
		InstaEntity entity1=new InstaEntity( "rakshu_mmj", "rakshu", 18,234);
		
		InstaEntity entity2=new InstaEntity("harshu_n", "harshu", 1123,2123434);
		
		InstaEntity entity3=new InstaEntity("nanditha_tk", "nanditha", 16,2345);
		InstaEntity entity4=new InstaEntity("sharu_k", "sharu", 165,4632345);
		
		
		InstaDAO dao = new InstaDAOImpl();
		List<InstaEntity> entities= new ArrayList<InstaEntity>();
		entities.add(entity);
		//entities.add(entity1);
		//entities.add(entity2);
		//entities.add(entity3);
		//entities.add(entity4);
		dao.create(entities);
	}
}
