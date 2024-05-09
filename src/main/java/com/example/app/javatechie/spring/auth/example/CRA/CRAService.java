package com.example.app.javatechie.spring.auth.example.CRA;

import java.util.List;


public interface CRAService {

	public String addCRA(DTOCRA dto);
	List <CRA> findAll();
	CRA findById(Integer id);
	CRA save(CRA CRA);
}

