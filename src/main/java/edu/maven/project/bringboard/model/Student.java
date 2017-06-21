package edu.maven.project.bringboard.model;

import java.io.Serializable;
import java.util.List;

public class Student {
	
	private int student_id;
	private String firstName;
	private String secondName;
	private String email_id;
	private List<Courses> coursesregistered;
	private String phone;
	private String password;
	
	
	
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public List<Courses> getCoursesregistered() {
		return coursesregistered;
	}
	public void setCoursesregistered(List<Courses> coursesregistered) {
		this.coursesregistered = coursesregistered;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//constructor
	public Student(int student_id) {
		super();
		this.student_id = student_id;
	}
	public Student() {
		super();
	}

	

}
