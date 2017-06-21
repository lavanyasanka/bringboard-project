package edu.maven.project.bringboard.dao;

import java.util.List;
import edu.maven.project.bringboard.model.Trainer;

public interface TrainerDao {
	
	public List<Trainer> getallTrainers() throws Exception;
	public Trainer getTrainerinfo(int trainer_id) throws Exception;
	public void updateTrainer(Trainer Traineridentifier) throws Exception;
	public void deleteTrainer(int trainer_id) throws  Exception;
	public void insertTrainer(Trainer Traineridentifier) throws  Exception;

}
