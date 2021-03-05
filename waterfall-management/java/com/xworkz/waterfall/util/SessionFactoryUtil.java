package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.exception.SFCreationException;

public class SessionFactoryUtil {
	private static SessionFactory factory;
	public static SessionFactory getFactory() {
		return factory;
	}
	static {
		System.out.println("initialising session factory static block");
		try {
			Configuration configuration=new Configuration();
			configuration.configure();
			//configuration.addAnnotatedClass(annotatedClass);
			factory = configuration.buildSessionFactory();
			if(factory!=null) {
				System.out.println("SFUtil created successfully");
			}
			else {
				throw new SFCreationException("cannot create session factory");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}