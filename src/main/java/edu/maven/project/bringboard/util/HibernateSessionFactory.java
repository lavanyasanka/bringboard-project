package edu.maven.project.bringboard.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	static SessionFactory sessionFactory = null;

	@SuppressWarnings("deprecation")
	public static SessionFactory createSessionFactory() throws Exception {
		
		if(sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
	}

}
