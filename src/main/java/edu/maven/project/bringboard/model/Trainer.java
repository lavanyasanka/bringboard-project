package edu.maven.project.bringboard.model;

import java.util.List;


public class Trainer {
	private int trainer_id;
	private String trainer_name;
	private List<Technologies> technologies_tought;
	private int years_experience;
	private int phone;
	private String email;
	
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public int getYears_experience() {
		return years_experience;
	}
	public void setYears_experience(int years_experience) {
		this.years_experience = years_experience;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Technologies> getTechnologies_tought() {
		return technologies_tought;
	}
	public void setTechnologies_tought(List<Technologies> technologies_tought) {
		this.technologies_tought = technologies_tought;
	}
	
	
}
