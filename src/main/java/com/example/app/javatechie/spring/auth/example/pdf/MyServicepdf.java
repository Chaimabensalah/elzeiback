package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.List;


import com.example.app.javatechie.spring.auth.example.pdf.DTOpdf;
import com.example.app.javatechie.spring.auth.example.pdf.pdf;

public interface MyServicepdf {
	public String addpdf(DTOpdf DTOpdf);
	List <pdf> findAll();
	pdf findById(Integer id);
	pdf save(pdf pdf);

}
