package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.Arrays;


import javax.persistence.*;

	@Entity
	@Table(name = "pdf")
	public class pdf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	 @Column(name = "periode")
	 private String periode;
	 
	 
	 @Column(name = "matricule")
	 private String matricule;

	 
	 @Column(name = "numSS")
	 private String numSS;
	 
    
    @Column(name = "Salairebrut")
    private String Salairebrut;
 
    
    @Column(name = "Totaldescotisationsetcontributions")
    private String Totaldescotisationsetcontributions;
    
    
    @Column(name = "netapayeravantimpôtsurlerevenu")
    private String netapayeravantimpôtsurlerevenu;
    
    
    @Column(name = "Netpaye")
    private String Netpaye;
    
    @Column(name = "chpatroniales")
    private String chpatroniales;
    
    
    
    public pdf() {
   	 
    }
   

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}

	public String getSalairebrut() {
		return Salairebrut;
	}

	public void setSalairebrut(String salairebrut) {
		Salairebrut = salairebrut;
	}

	public String getTotaldescotisationsetcontributions() {
		return Totaldescotisationsetcontributions;
	}

	public void setTotaldescotisationsetcontributions(String totaldescotisationsetcontributions) {
		Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
	}

	public String getNetapayeravantimpôtsurlerevenu() {
		return netapayeravantimpôtsurlerevenu;
	}

	public void setNetapayeravantimpôtsurlerevenu(String netapayeravantimpôtsurlerevenu) {
		this.netapayeravantimpôtsurlerevenu = netapayeravantimpôtsurlerevenu;
	}

	public String getNetpaye() {
		return Netpaye;
	}

	public void setNetpaye(String netpaye) {
		Netpaye = netpaye;
	}

	public String getChpatroniales() {
		return chpatroniales;
	}

	public void setChpatroniales(String chpatroniales) {
		this.chpatroniales = chpatroniales;
	}


	@Override
	public String toString() {
		return "pdf [id=" + id + ", periode=" + periode + ", matricule=" + matricule + ", numSS=" + numSS
				+ ", Salairebrut=" + Salairebrut + ", Totaldescotisationsetcontributions="
				+ Totaldescotisationsetcontributions + ", netapayeravantimpôtsurlerevenu="
				+ netapayeravantimpôtsurlerevenu + ", Netpaye=" + Netpaye + ", chpatroniales=" + chpatroniales
				+ ", getId()=" + getId() + ", getPeriode()=" + getPeriode() + ", getMatricule()=" + getMatricule()
				+ ", getNumSS()=" + getNumSS() + ", getSalairebrut()=" + getSalairebrut()
				+ ", getTotaldescotisationsetcontributions()=" + getTotaldescotisationsetcontributions()
				+ ", getNetapayeravantimpôtsurlerevenu()=" + getNetapayeravantimpôtsurlerevenu() + ", getNetpaye()="
				+ getNetpaye() + ", getChpatroniales()=" + getChpatroniales() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public pdf(Integer id, String periode, String matricule, String numSS, String salairebrut,
			String totaldescotisationsetcontributions, String netapayeravantimpôtsurlerevenu, String netpaye,
			String chpatroniales) {
		super();
		this.id = id;
		this.periode = periode;
		this.matricule = matricule;
		this.numSS = numSS;
		this.Salairebrut = salairebrut;
		this.Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
		this.netapayeravantimpôtsurlerevenu = netapayeravantimpôtsurlerevenu;
		this.Netpaye = netpaye;
		this.chpatroniales = chpatroniales;
	}
    
    
    
    
    
    
	}
    
    
