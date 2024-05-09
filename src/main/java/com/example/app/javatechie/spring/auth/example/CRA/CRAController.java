package com.example.app.javatechie.spring.auth.example.CRA;

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

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.CRA.CRAService;
import com.example.app.javatechie.spring.auth.example.CRA.DTOCRA;


@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping("/api/CRA")
public class CRAController {


	  @Autowired
	   public CRAService CRAService;


	    @PostMapping("/save")
	    public String saveCRA(@RequestBody DTOCRA dto) {
	    	String id=CRAService.addCRA(dto);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<CRA> getAll() {
	        return CRAService.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public CRA get(@PathVariable("id") Integer id) {
	    	return CRAService.findById(id);
	    }
	    
}
