package fr.sopra.formation.monRdv.beans;

import java.util.HashSet;
import java.util.Set;

//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Version;

public class RDV {
	private int id;
	private int version;
//	private Praticien praticien;
//	private Patient patient;
//	private Utilisateur utilisateur;
//	private Motif motif;
//	private Set<Creneaux> creneaux = new HashSet<>();

	public RDV() {
		id = 20;
		version = 0;
	}

//	public RDV(Praticien praticien, Patient patient, Utilisateur utilisateur, Motif motif) {
//		this.praticien = praticien;
//		this.patient = patient;
//		this.utilisateur = utilisateur;
//		this.motif = motif;
//	}
	
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

//	public Praticien getPraticien() {
//		return praticien;
//	}
//
//	public void setPraticien(Praticien praticien) {
//		this.praticien = praticien;
//	}
//
//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
//
//	public Utilisateur getUtilisateur() {
//		return utilisateur;
//	}
//
//	public void setUtilisateur(Utilisateur utilisateur) {
//		this.utilisateur = utilisateur;
//	}
//
//	public Motif getMotif() {
//		return motif;
//	}
//
//	public void setMotif(Motif motif) {
//		this.motif = motif;
//	}
//
//	public Set<Creneaux> getCreneaux() {
//		return creneaux;
//	}
//
//	public void setCreneaux(Set<Creneaux> creneaux) {
//		this.creneaux = creneaux;
//	}

}
