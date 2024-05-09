package com.example.app.javatechie.spring.auth.example.pdf;

public class DTOpdf {
	    public int id;
	    public String periode;
	    public String matricule;
	    public String numSS;
	    public String Salairebrut;
	    public String Totaldescotisationsetcontributions;
	    public String Netapayeravantimpôtsurlerevenu;
	    public String Netpaye;
	    public String chpatroniales;
	    
	    
		public String getPeriode() {
			return periode;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
			return Netapayeravantimpôtsurlerevenu;
		}
		public void setNetapayeravantimpôtsurlerevenu(String netapayeravantimpôtsurlerevenu) {
			Netapayeravantimpôtsurlerevenu = netapayeravantimpôtsurlerevenu;
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
		public DTOpdf(int id, String periode, String matricule, String numSS, String salairebrut,
				String totaldescotisationsetcontributions, String netapayeravantimpôtsurlerevenu, String netpaye,
				String chpatroniales) {
			super();
			this.id = id;
			this.periode = periode;
			this.matricule = matricule;
			this.numSS = numSS;
			this.Salairebrut = salairebrut;
			this.Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
			this.Netapayeravantimpôtsurlerevenu = netapayeravantimpôtsurlerevenu;
			this.Netpaye = netpaye;
			this.chpatroniales = chpatroniales;
		}
	
}