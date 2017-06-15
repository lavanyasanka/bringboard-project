package edu.maven.project.bringboard.daoimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
			Student = session.createQuery("FROM Student").list(); 

			Student.forEach(students -> System.out.println(students));
			tx.commit();
			session.close();
		}catch (Exception ex){
			ex.printStackTrace();
		}

		return Student;
	}

	@Override
	public Student getStudentinfo(int student_id) throws HibernateException, Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Query query=session.createQuery("from Student where");
			Student student = (Student)session.load(Student.class, new Integer(student_id));


		}catch(Exception ex){
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateStudent(Student Studentidentifier) throws Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.update(Studentidentifier);

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

		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

}
