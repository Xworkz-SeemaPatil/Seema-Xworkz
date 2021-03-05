package com.xworkz.coupon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.util.SessionFactoryUtil;

public class CouponDAOImpl implements CouponDAO {
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	
	public CouponDAOImpl() {
		// TODO Auto-generated constructor stub
	}

@Override
public void create(CouponEntity entity) {
	System.out.println("invoked create");
	System.out.println("entity" + entity);
	try (Session session = factory.openSession()){
	Transaction transaction = session.beginTransaction();
	session.save(entity);
	transaction.commit();
	System.out.println("Commit is success");
}
}
@Override
public CouponEntity getById(int id) {
		System.out.println("invoked getById");
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		CouponEntity entityFromDB=session.get(CouponEntity.class,id);
		transaction.commit();
		System.out.println("Got the element successfully");
	return entityFromDB;
}

@Override
public void UpdateNameAndCodeById(String code, String name, int id) {
	System.out.println("invoked UpdateUserNameAndNameById");
	try(Session session=factory.openSession()){
	Transaction transaction=session.beginTransaction();
	CouponEntity entityFromDB=session.get(CouponEntity.class,id);
	if (entityFromDB != null) {
	System.out.println(" can update");
	entityFromDB.setCode(code);
	entityFromDB.setName(name);
	session.update(entityFromDB);
	transaction.commit();
	System.out.println("Updated the element successfully");
	}
	else {
	System.out.println("Updated the element successfully");
	}
	}
}

@Override
public void deleteById(int id) {
	System.out.println("invoked UpdateUserNameAndNameById");
	try(Session session=factory.openSession()){
	Transaction transaction=session.beginTransaction();
	CouponEntity entityFromDB=session.get(CouponEntity.class,id);
	if (entityFromDB != null) {
	session.delete(entityFromDB);
	}
	transaction.commit();
	System.out.println("Deleted the element successfully");
}
}

@Override
public void create(List<CouponEntity> entities) {
	Transaction transaction=null;
	System.out.println("invoked create");
	System.out.println("entity" + entities);
	try {
		Session session = factory.openSession();
		transaction=session.beginTransaction();
		for (CouponEntity couponEntity : entities) {
			// session.flush();
			session.save(couponEntity);
		}
		  transaction.commit();
		
	} catch (HibernateException e) {
		e.printStackTrace();
		//transaction.rollback();
	}
	catch (Exception e) {
		e.printStackTrace();
		//transaction.rollback();
	}

	}
}
