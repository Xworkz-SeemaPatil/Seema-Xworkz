package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SessionFactoryUtil;

public class WaterFallDAOImpl implements WaterFallDAO {
	private SessionFactory factory = SessionFactoryUtil.getFactory();

	public WaterFallDAOImpl() {
		System.out.println("created" + this.getClass());
	}

	@Override
	public void create(WaterFallEntity entity) {
		System.out.println("invoked create");
		System.out.println("Entity: " + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("commited sucessfully");
		}
	}

	@Override
	public WaterFallEntity updateHeightAndDeapthById(double height,double deapth,int id) {
		System.out.println("invoked updateHeightAndDeapthById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entityFromDB=session.get(WaterFallEntity.class,id);
			entityFromDB.setDepth(deapth);
			entityFromDB.setHeight(height);
			session.update(entityFromDB);
			transaction.commit();
			System.out.println("updated sucessfully");

			return entityFromDB;
		}
	}

	@Override
	public WaterFallEntity getById(int id) {
		System.out.println("invoked updateHeightAndDeapthById");
		try(Session session=factory.openSession()){
		Transaction transaction = session.beginTransaction();
		WaterFallEntity entityFromDB=session.get(WaterFallEntity.class,id);
		transaction.commit();
		System.out.println("got sucessfully");
		return entityFromDB;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deletedById");
		try(Session session=factory.openSession()){
		Transaction transaction = session.beginTransaction();
		WaterFallEntity entityFromDB=session.get(WaterFallEntity.class,id);
		session.delete(entityFromDB);
		transaction.commit();
		System.out.println("deleted sucessfully");
		}
		
	
	}
}
