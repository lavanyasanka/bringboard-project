package edu.maven.project.bringboard.dao;

import java.util.List;

import edu.maven.project.bringboard.model.Technologies;

public interface TechnologiesDao {
	public List<Technologies> getallTechnologies() throws Exception;
	public Technologies getTechnoinfo(int tech_id) throws Exception;
	public void updateTechnologies(Technologies Technologiesidentifier) throws Exception;
	public void deleteTechnologies(int tech_id) throws  Exception;
	public void insertTechnologies(Technologies Technologiesidentifier) throws  Exception;

}
