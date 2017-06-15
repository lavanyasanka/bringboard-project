package edu.maven.project.bringboard.model;

public class Courses {
	private int course_id; 
	private String coursename;
	private int duration;
	private String instructor;
	private int numberofStudents;
	
	
	//getters and setters
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getNumberofStudents() {
		return numberofStudents;
	}
	public void setNumberofStudents(int numberofStudents) {
		this.numberofStudents = numberofStudents;
	}
	
	//constructors
	public Courses(int course_id) {
		super();
		this.course_id = course_id;
	}
	public Courses(String instructor) {
		super();
		this.instructor = instructor;
	}
	public Courses(String coursename, String instructor) {
		super();
		this.coursename = coursename;
		this.instructor = instructor;
	}
	public Courses() {
		super();
	}
	
	
	
	

}
