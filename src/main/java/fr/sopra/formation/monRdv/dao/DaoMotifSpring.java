package fr.sopra.formation.monRdv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;

import fr.sopra.formation.monRdv.App;
import fr.sopra.formation.monRdv.beans.Motif;
import fr.sopra.formation.monRdv.beans.RDV;
import fr.sopra.formation.monRdv.dao.IDaoMotif;

public class DaoMotifSpring implements IDaoMotif {
	private DataSource dataSource;

	public int AddMotif(Motif motif) {
		int rows2 = 0;
		// String INSERT_RDV = "insert into rdv values(?, ?, ?, ?, ?, ?)";
		String INSERT_Motif = "insert into motif values(?, ?, ?, ?, ?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_Motif);
			ps.setInt(1, motif.getId());
			ps.setInt(2, motif.getVersion());
			ps.setString(3, motif.getMotif());
			ps.setInt(4, motif.getPrix());
			ps.setInt(5, motif.getDuree());

			// ps.set(3, rdv.getPraticien());

			rows2 = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows2;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// public List<Motif> findAll() {
	// List<Motif> liste = null;
	// EntityManager em = null;
	// EntityTransaction tx = null;
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// TypedQuery<Motif> query = em.createQuery("from Motif", Motif.class);
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
	// public Motif find(Integer id) {
	// Motif obj = null;
	// EntityManager em = null;
	// EntityTransaction tx = null;
	//
	// try {
	// em = App.getInstance().getEmf().createEntityManager();
	// tx = em.getTransaction();
	// tx.begin();
	//
	// obj = em.find(Motif.class, id);
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
	// public Motif save(Motif obj) {
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
	// public void delete(Motif obj) {
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
