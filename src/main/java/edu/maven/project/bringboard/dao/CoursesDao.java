package edu.maven.project.bringboard.dao;

import java.util.List;

import org.hibernate.HibernateException;

import edu.maven.project.bringboard.model.Courses;

public interface CoursesDao {

	public List<Courses> getAllCourses() throws Exception;
	public Courses getcourseinfo(int course_id) throws  Exception;
	public String getinstructorinfo(int course_id) throws  Exception;
	public void updateCourse(Courses courseidentifier) throws  Exception;
	public void deleteCourse(int course_id) throws  Exception;
	public void insertCourse(Courses courseidentifier) throws  Exception;

}
