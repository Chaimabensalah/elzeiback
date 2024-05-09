package com.example.app.javatechie.spring.auth.example.mission;

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;


public class DTOmission {
	public int id;
    public String codemission;
	public String datedebut;
    public String datefin;
    public String tjm;
    public Client clientid;
    public Salaries salariesid;
    

    
    
    public DTOmission () {}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}

	public String getCodemission() {
		return codemission;
	}




	public void setCodemission(String codemission) {
		this.codemission = codemission;
	}



	public String getDatedebut() {
		return datedebut;
	}




	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}




	public String getDatefin() {
		return datefin;
	}




	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}




	public String getTjm() {
		return tjm;
	}




	public void setTjm(String tjm) {
		this.tjm = tjm;
	}




	public Client getClientid() {
		return clientid;
	}




	public void setClientid(Client clientid) {
		this.clientid = clientid;
	}




	public Salaries getSalariesid() {
		return salariesid;
	}




	public void setSalariesid(Salaries salariesid) {
		this.salariesid = salariesid;
	}




	@Override
	public String toString() {
		return "DTOmission [id=" + id + ", codemission=" + codemission + ", datedebut=" + datedebut + ", datefin="
				+ datefin + ", tjm=" + tjm + ", clientid=" + clientid + ", salariesid=" + salariesid + ", getId()="
				+ getId() + ", getCodemission()=" + getCodemission() + ", getDatedebut()=" + getDatedebut()
				+ ", getDatefin()=" + getDatefin() + ", getTjm()=" + getTjm() + ", getClientid()=" + getClientid()
				+ ", getSalariesid()=" + getSalariesid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}




	public DTOmission(int id, String codemission, String datedebut, String datefin, String tjm, Client clientid,
			Salaries salariesid) {
		super();
		this.id = id;
		this.codemission = codemission;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.tjm = tjm;
		this.clientid = clientid;
		this.salariesid = salariesid;
	}




	





}