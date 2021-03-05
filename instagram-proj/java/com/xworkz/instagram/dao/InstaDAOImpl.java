package com.xworkz.instagram.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.instagram.entity.InstaEntity;
import com.xworkz.instagram.util.SessionFactoryUtil;

public class InstaDAOImpl implements InstaDAO{

	private SessionFactory factory = SessionFactoryUtil.getFactory();
	public InstaDAOImpl() {
		
		}
	
	@Override
	public void create(InstaEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("Commit is success");
	}

	@Override
	public InstaEntity getById(int id) {
		System.out.println("invoked getById");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		InstaEntity entityFromDb = session.get(InstaEntity.class, id);
		transaction.commit();
		return entityFromDb;
	}

	@Override
	public void UpdateUserNameAndNameById(String usrName, String name, int id) {
		InstaEntity entity;
		System.out.println("UpdateBrandAndCostById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(InstaEntity.class, id);
			if (entity != null) {
				System.out.println("update is done" + id);
				entity.setUsrName(usrName);
				entity.setName(name);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("cannot update");
			}
		}


	}

	@Override
	public void deleteById(int id) {
		InstaEntity entity;
		System.out.println("deleteById");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			entity = session.get(InstaEntity.class, id);
			if (entity != null) {
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot delete");
			}
		}
	}

	@Override
	public void create(List<InstaEntity> entities) {
		Transaction transaction = null;
		System.out.println("invoked create");
		try {
			Session session = factory.openSession();
			{
				transaction = session.beginTransaction();
				for (InstaEntity watchEntity : entities) {
					// session.flush();
					session.save(watchEntity);
				}
				transaction.commit();
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	}





