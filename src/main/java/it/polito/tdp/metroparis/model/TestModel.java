package it.polito.tdp.metroparis.model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		Model m = new Model() ;
		
		m.creaGrafo(); 
		
		Fermata p = m.trovaFermata("La Fourche");
		if(p==null) {
			
		}
		else {
		List<Fermata> raggiungibili = m.fermateRaggiungibili(p);
		}
		
		Fermata a = m.trovaFermata("Temple");
		List<Fermata> percorso=m.trovaCammino(p,a);
		System.out.println(percorso);

	}

}
