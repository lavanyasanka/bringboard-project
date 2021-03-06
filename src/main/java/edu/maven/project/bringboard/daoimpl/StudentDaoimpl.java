package edu.maven.project.bringboard.daoimpl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import edu.maven.project.bringboard.util.HibernateSessionFactory;
import edu.maven.project.bringboard.dao.StudentDao;
import edu.maven.project.bringboard.model.Student;


public class StudentDaoimpl implements StudentDao{

	@Override
	public List<Student> getAllStudents() throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		List<Student> Student = null;
		try{
			tx = session.beginTransaction();
			Student = session.createCriteria(Student.class).list();
			Student.forEach(students -> System.out.println(students));
			tx.commit();
			session.close();
		}catch (Exception ex){
			ex.printStackTrace();
		}

		return Student;
	}

	@Override
	public Student getStudentinfo(int student_id) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		Student student = null;
		try{
			tx = session.beginTransaction();
			Criteria cr =session.createCriteria(Student.class);
			student = (Student) cr.add(Restrictions.eq("student_id", student_id));
			tx.commit();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

		return student;
	}

	@Override
	public void updateStudent(Student Studentidentifier) throws Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.update(Studentidentifier);
			tx.commit();
			session.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteStudent(int Student_id) throws HibernateException, Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Student student = (Student)session.get(Student.class, Student_id);
			session.delete(student); 
			tx.commit();
			session.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

	@Override
	public void insertStudent(Student Studentidentifier) throws HibernateException, Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(Studentidentifier); 
			tx.commit();
			session.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

}
