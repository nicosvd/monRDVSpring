package fr.sopra.formation.monRdv.beans;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Version;

public class Motif {
	private int id;
	private int version;
	private String motif;
	private int prix;
	private int duree;
//	private List<PraticienMotif> praticiens = new ArrayList<>();

	public Motif() {
		id = 21;
		version = 1;
		motif = "Consultation";
		prix = 20;
		duree = 30;
	}

	public Motif(String motif, int prix, int duree) {
		this.motif = motif;
		this.prix = prix;
		this.duree = duree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

//	public List<PraticienMotif> getPraticiens() {
//		return praticiens;
//	}
//
//	public void setPraticiens(List<PraticienMotif> praticiens) {
//		this.praticiens = praticiens;
//	}

}
