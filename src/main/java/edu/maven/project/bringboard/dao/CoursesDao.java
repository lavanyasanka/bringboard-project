package edu.maven.project.bringboard.dao;

import java.util.List;

import org.hibernate.HibernateException;

import edu.maven.project.bringboard.model.Courses;

public interface CoursesDao {

	public List<Courses> getAllCourses() throws Exception;
	public Courses getcourseinfo(int course_id);
	public String getinstructorinfo(int course_id);
	public void updateCourse(Courses courseidentifier);
	public void deleteCourse(int course_id);
	public void insertCourse(Courses courseidentifier) throws HibernateException, Exception;

}
