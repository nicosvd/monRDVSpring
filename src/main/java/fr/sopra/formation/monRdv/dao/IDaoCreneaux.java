package fr.sopra.formation.monRdv.dao;

import java.util.Date;
import java.util.List;

import fr.sopra.formation.monRdv.beans.Creneaux;
//import fr.sopra.formation.monRdv.beans.Praticien;
import fr.sopra.formation.monRdv.beans.Motif;

public interface IDaoCreneaux {
	public int AddCreneaux(Creneaux creneaux);

	// List<Creneaux> findCreneauxByPraticienAndDateTime(Praticien praticien, Date
	// dtRdv, int duree);
}
