package edu.maven.project.bringboard.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import edu.maven.project.bringboard.dao.TechnologiesDao;
import edu.maven.project.bringboard.model.Technologies;
import edu.maven.project.bringboard.util.HibernateSessionFactory;

public class TechnologiesDaoimpl implements TechnologiesDao{

	@Override
	public List<Technologies> getallTechnologies() throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Technologies.class);
		List<Technologies> technologies = cr.list();
		technologies.forEach(techn -> System.out.println(techn));
		tx.commit();
		session.close();
		return technologies;
	}


	@Override
	public void updateTechnologies(Technologies Technologiesidentifier) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		session.update(Technologiesidentifier);
		tx.commit();
		session.close();

	}

	@Override
	public void deleteTechnologies(int tech_id) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx= session.beginTransaction();
		session.delete(tech_id);
		tx.commit();
		session.close();

	}

	@Override
	public void insertTechnologies(Technologies Technologiesidentifier) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx= session.beginTransaction();
		session.save(Technologiesidentifier);
		tx.commit();
		session.close();

	}


	@Override
	public Technologies getTechnoinfo(int tech_id) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Technologies.class);
		Technologies tech = (Technologies) cr.add(Restrictions.eq("tech_id", tech_id));
		tx.commit();
		session.close();
		return tech;
	}

}
