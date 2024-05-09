package com.example.app.javatechie.spring.auth.example.mission;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.mission.MissionService;
import com.example.app.javatechie.spring.auth.example.mission.DTOmission;


@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping("/api/Mission")
public class MissionController {


	  @Autowired
	   public MissionService MissionService;


	    @PostMapping("/save")
	    public String saveMission(@RequestBody DTOmission dto) {
	    	String id=MissionService.addMission(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Mission> getAll() {
	        return MissionService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Mission get(@PathVariable("id") int id) {
	    	return MissionService.findById(id);
	    }
	    
}
