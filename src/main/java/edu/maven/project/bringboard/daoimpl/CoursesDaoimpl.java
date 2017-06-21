package edu.maven.project.bringboard.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.maven.project.bringboard.dao.CoursesDao;
import edu.maven.project.bringboard.model.Courses;
import edu.maven.project.bringboard.util.HibernateSessionFactory;

public class CoursesDaoimpl implements CoursesDao {

	@Override
	public List<Courses> getAllCourses() throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		List<Courses> courses = null;
		try{
			tx = session.beginTransaction();
			courses = session.createCriteria(Courses.class).list(); 
			courses.forEach(course -> System.out.println(course));
			tx.commit();
			session.close();
		}catch (Exception ex){
			ex.printStackTrace();
		}

		return courses;
	}

	@Override
	public Courses getcourseinfo(int course_id) throws  Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Courses course = (Courses)session.load(Courses.class, course_id);
			tx.commit();
			session.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public String getinstructorinfo(int course_id) throws  Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Courses course = (Courses)session.load(Courses.class, new Integer(course_id));
			System.out.println("instructor name:"+course.getTrainerinfo());
			tx.commit();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

		return null;

	}

	@Override
	public void updateCourse(Courses courseidentifier) throws HibernateException, Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.update(courseidentifier);
			tx.commit();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

	@Override
	public void deleteCourse(int course_id) throws  Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Courses course = (Courses)session.get(Courses.class, course_id);
			session.delete(course); 
			tx.commit();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

	@Override
	public void insertCourse(Courses courseidentifier) throws Exception {
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(courseidentifier); 
			tx.commit();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
