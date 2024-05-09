package com.example.app.javatechie.spring.auth.example.mission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.app.javatechie.spring.auth.example.mission.DTOmission;
import com.example.app.javatechie.spring.auth.example.mission.Mission;

	@Service
	public class MissionImp implements MissionService  {

	    @Autowired
	    public MissionRepo MissionRepo;
	  
	    @Override
	    public String addMission(DTOmission dto) {
	    	Mission Mission = new Mission(
	    			 dto.getId(),
	                 dto.getDatedebut(), 
	                 dto.getDatefin(), 
	                 dto.getTjm(),
	                 dto.getCodemission(),
	                 dto.getClientid(),
	                 dto.getSalariesid()                 
	                );
	             
	    	MissionRepo.save(Mission);

	        // Return the ID of the saved simulator, or adjust based on your logic:
	        return String.valueOf(Mission.getId()); // Convert ID to String
	    }

	    @Override
	    public List<Mission> findAll() {
	        return MissionRepo.findAll();
	    }

	    @Override
	    public Mission findById(int id) {
	        if (MissionRepo.findById(id).isPresent()) {
	            return MissionRepo.findById(id).get();
	        }
	        return null;
	    }
	    
	       
	    @Override
	    public Mission save(Mission Mission) {

	    	MissionRepo.save(Mission);

	        return Mission;

	    }

	    
	}



