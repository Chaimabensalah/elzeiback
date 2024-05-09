package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.javatechie.spring.auth.example.pdf.DTOpdf;
import com.example.app.javatechie.spring.auth.example.pdf.pdf;
import com.example.app.javatechie.spring.auth.example.pdf.pdfRepository;
@Service
public class MyservicepdfImp implements MyServicepdf {
	
	
	    @Autowired
	    public pdfRepository pdfRepository;
	  
	   

	    @Override
	    public String addpdf(DTOpdf DTOpdf) {
	    	pdf pdf = new pdf(
	        		DTOpdf.getId(),               
	        		DTOpdf.getMatricule(),
	        		DTOpdf.getNumSS(), 	                            
	        		DTOpdf.getPeriode(),      
	        		DTOpdf.getSalairebrut(), 
	        		DTOpdf.getTotaldescotisationsetcontributions(),
	        		DTOpdf.getNetapayeravantimpôtsurlerevenu(),   
	        		DTOpdf.getNetpaye(),
	        		DTOpdf.getChpatroniales()
	                );
	        
	        
	    	pdfRepository.save(pdf);

	        // Return the ID of the saved simulator, or adjust based on your logic:
	        return String.valueOf(pdf.getId()); // Convert ID to String
	    }

	    @Override
	    public List<pdf> findAll() {
	        return pdfRepository.findAll();
	    }

	    @Override
	    public pdf findById(Integer id) {
	        if (pdfRepository.findById(id).isPresent()) {
	            return pdfRepository.findById(id).get();
	        }
	        return null;
	    }
	    
	    
	    
	    @Override
	    public pdf save(pdf pdf) {

	    	pdfRepository.save(pdf);

	        return pdf;

	    }


}