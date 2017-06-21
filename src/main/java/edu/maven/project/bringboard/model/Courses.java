package edu.maven.project.bringboard.model;

public class Courses {
	private int course_id; 
	private String coursename;
	private int duration;
	private int numberofStudents;
	private Trainer trainerinfo;
	
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

	public int getNumberofStudents() {
		return numberofStudents;
	}
	public void setNumberofStudents(int numberofStudents) {
		this.numberofStudents = numberofStudents;
	}
	
	public Trainer getTrainerinfo() {
		return trainerinfo;
	}
	public void setTrainerinfo(Trainer trainerinfo) {
		this.trainerinfo = trainerinfo;
	}
	//constructors
	public Courses(int course_id) {
		super();
		this.course_id = course_id;
	}

	public Courses(int course_id, Trainer trainerinfo) {
		super();
		this.course_id = course_id;
		this.trainerinfo = trainerinfo;
	}
	public Courses() {
		super();
	}
	
	
	
	

}
