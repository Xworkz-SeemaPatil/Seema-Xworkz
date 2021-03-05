package com.xworkz.bbkc.dao;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbkc.dao.BBCDAO;
import com.xworkz.bbkc.entity.BBCEntity;

public class BBCDAOImpl implements BBCDAO{

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoke create");
		System.out.println("entity: "+entity);
		Configuration cfg=new Configuration();//job of the configure find the path and information loaded into the memory  --internally uses parser --parser converts into DOM
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);//the meta info about the entity, table column //it depends on how many tables are there 
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		System.out.println("invoke get by id");
		System.out.println(id);
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		BBCEntity entityFromDB=session.get(BBCEntity.class,id);
		transaction.commit();
		session.close();
		factory.close();
		
		return entityFromDB;
	}

	@Override
	public BBCEntity updateDaysInAndNoOfTasksById(int id, int noOfTask, int daysIn) {
		System.out.println("invoke updateDaysInAndNoOfTasksById");
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entityFromDB=session.get(BBCEntity.class,id);
		if(entityFromDB !=null) {
			System.out.println("id found , can update");
			entityFromDB.setDaysIn(daysIn);
			entityFromDB.setNoOfTask(noOfTask);
			session.update(entityFromDB);
			transaction.commit();
			session.close();
			factory.close();
			
			
		}
		else {
			System.out.println("id not found , can't update");
			
		}
		
		return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoke deleteById");
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entityFromDB=session.get(BBCEntity.class,id);
		if(entityFromDB !=null) {
			System.out.println("id found , can delete");
			session.delete(entityFromDB);
			transaction.commit();
			session.close();
			factory.close();
	}
		else {
			System.out.println("id not found , can't delete");
			
		}
		
	
	}

	@Override
	public BBCEntity updateNameById(String name, int id) {
		Configuration configure= new Configuration();
		configure.configure();
		configure.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entityFromDB=session.get(BBCEntity.class,id);
		if(entityFromDB!=null) {
			System.out.println("id found you can update");
			entityFromDB.setName(name);
			session.update(entityFromDB);
			transaction.commit();
			session.close();
			factory.close();
			
			
		}
		else {
			System.out.println("id not found , can't update");
			
		}
		
		
		return entityFromDB;
	}
}
