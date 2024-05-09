package com.example.app.javatechie.spring.auth.example.mission;

import java.util.List;


public interface MissionService {

	public String addMission(DTOmission dto);
	List <Mission> findAll();
	Mission findById(int id);
	Mission save(Mission Mission);
}

