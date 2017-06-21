package edu.maven.project.bringboard.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import edu.maven.project.bringboard.dao.TrainerDao;
import edu.maven.project.bringboard.model.Trainer;
import edu.maven.project.bringboard.util.HibernateSessionFactory;

public class TrainerDaoimpl implements TrainerDao{

	@Override
	public List<Trainer> getallTrainers() throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Trainer.class);
		List<Trainer> trainer = cr.list();
		tx.commit();
		session.close();
		return trainer;
	
	}

	@Override
	public Trainer getTrainerinfo(int trainer_id) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Trainer.class);
		Trainer trainer = (Trainer) cr.add(Restrictions.eq("trainer_id", trainer_id));
		tx.commit();
		session.close();
		return trainer;
	}

	@Override
	public void updateTrainer(Trainer Traineridentifier) throws Exception {
		
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		session.update(Traineridentifier);
		tx.commit();
		session.close();
	}

	@Override
	public void deleteTrainer(int trainer_id) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		session.delete(trainer_id);
		tx.commit();
		session.close();
	}

	@Override
	public void insertTrainer(Trainer Traineridentifier) throws Exception {
		
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		session.save(Traineridentifier);
		tx.commit();
		session.close();
	}

}
