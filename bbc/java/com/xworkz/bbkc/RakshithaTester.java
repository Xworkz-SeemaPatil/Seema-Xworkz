package com.xworkz.bbkc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbkc.entity.BBCEntity;

public class RakshithaTester {
	// to understand update method
	public static void main(String[] args) {
	
			Configuration configuration =new Configuration().configure().addAnnotatedClass(BBCEntity.class);
			SessionFactory factory=null;
	try {
		factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entity=new BBCEntity();
		entity.setId(4);
			entity.setName("noOfTask");
			session.update(entity);
			transaction.commit();
	
	}
	finally{
		factory.close();
	}	
}
}
