package fr.sopra.formation.monRdv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;

import fr.sopra.formation.monRdv.App;
import fr.sopra.formation.monRdv.beans.Creneaux;
import fr.sopra.formation.monRdv.beans.Motif;
//import fr.sopra.formation.monRdv.beans.Praticien;
import fr.sopra.formation.monRdv.dao.IDaoCreneaux;

public class DaoCreneauxSpring implements IDaoCreneaux {
	private DataSource dataSource;

	public int AddCreneaux(Creneaux creneaux) {
		int rows3 = 0;
		// String INSERT_RDV = "insert into rdv values(?, ?, ?, ?, ?, ?, ?)";
		String INSERT_Creneaux = "insert into creneaux values(?, ?, ?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_Creneaux);
			ps.setInt(1, creneaux.getId());
			ps.setInt(2, creneaux.getVersion());
			ps.setInt(3, creneaux.getTempsCreneau());
			

			// ps.set(3, rdv.getPraticien());

			rows3 = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows3;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// public List<Creneaux> findAll() {
	// List<Creneaux> liste = null;
	// EntityManager em = null;
	// EntityTransaction tx = null;
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// TypedQuery<Creneaux> query = em.createQuery("from Creneaux", Creneaux.class);
	//
	// liste = query.getResultList();
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// if (tx != null) {
	// tx.rollback();
	// }
	// } finally {
	// if (em != null) {
	// em.close();
	// }
	// }
	//
	// return liste;
	// }
	//
	// public List<Creneaux> findCreneauxByPraticienAndDateTime(Praticien praticien,
	// Date dtRdv, int duree) {
	// List<Creneaux> liste = null;
	// EntityManager em = null;
	// EntityTransaction tx = null;
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// Calendar dtRdvEnd = Calendar.getInstance();
	// dtRdvEnd.setTime(dtRdv);
	// dtRdvEnd.add(Calendar.MINUTE, duree);
	//
	// TypedQuery<Creneaux> query = em.createQuery(
	// "select c from Creneaux c where c.praticien = :praticien and c.date >=
	// :dtRdvStart and c.date < :dtRdvEnd",
	// Creneaux.class);
	// query.setParameter("praticien", praticien);
	// query.setParameter("dtRdvStart", dtRdv, TemporalType.TIMESTAMP);
	// query.setParameter("dtRdvEnd", dtRdvEnd.getTime(), TemporalType.TIMESTAMP);
	//
	// liste = query.getResultList();
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// if (tx != null) {
	// tx.rollback();
	// }
	// } finally {
	// if (em != null) {
	// em.close();
	// }
	// }
	//
	// return liste;
	// }
	//
	// public Creneaux find(Integer id) {
	// Creneaux obj = null;
	// EntityManager em = null;
	// EntityTransaction tx = null;
	//
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// obj = em.find(Creneaux.class, id);
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// if (tx != null) {
	// tx.rollback();
	// }
	// } finally {
	// if (em != null) {
	// em.close();
	// }
	// }
	//
	// return obj;
	// }
	//
	// public Creneaux save(Creneaux obj) {
	// EntityManager em = null;
	// EntityTransaction tx = null;
	//
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// obj = em.merge(obj);
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// if (tx != null) {
	// tx.rollback();
	// }
	// } finally {
	// if (em != null) {
	// em.close();
	// }
	// }
	//
	// return obj;
	// }
	//
	// public void delete(Creneaux obj) {
	// EntityManager em = null;
	// EntityTransaction tx = null;
	//
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// em.remove(em.merge(obj));
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// if (tx != null) {
	// tx.rollback();
	// }
	// } finally {
	// if (em != null) {
	// em.close();
	// }
	// }
	// }

}
