package edu.maven.project.bringboard.dao;

import java.util.List;

import org.hibernate.HibernateException;

import edu.maven.project.bringboard.model.Student;

public interface StudentDao {
	public List<Student> getAllStudents() throws Exception;
	public Student getStudentinfo(int student_id) throws HibernateException, Exception;
	public void updateStudent(Student Studentidentifier) throws Exception;
	public void deleteStudent(int student_id) throws HibernateException, Exception;
	public void insertStudent(Student Studentidentifier) throws HibernateException, Exception;

}
