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
import fr.sopra.formation.monRdv.beans.RDV;
import fr.sopra.formation.monRdv.dao.IDaoRDV;

public class DaoRDVSpring implements IDaoRDV {
	private DataSource dataSource;

	public int AddRdv(RDV rdv) {
		int rows1 = 0;
//		String INSERT_RDV = "insert into rdv values(?, ?, ?, ?, ?, ?, ?)";
		String INSERT_RDV = "insert into rdv values(?, ?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_RDV);
			ps.setInt(1, rdv.getId());
			ps.setInt(2, rdv.getVersion());
			
//			ps.set(3, rdv.getPraticien());
//			ps.setInt(4, rdv.getPatient());
//			ps.setString(5, rdv.getUtilisateur());
//			ps.setString(6, rdv.getMotif());
//			ps.setString(7, rdv.getCreneaux());
			
			rows1 = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows1;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

//	public List<RDV> findAll() {
//		List<RDV> liste = null;
//		EntityManager em = null;
//		EntityTransaction tx = null;
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			TypedQuery<RDV> query = em.createQuery("from RDV", RDV.class);
//
//			liste = query.getResultList();
//
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (tx != null) {
//				tx.rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//
//		return liste;
//	}
//
//	public RDV find(Integer id) {
//		RDV obj = null;
//		EntityManager em = null;
//		EntityTransaction tx = null;
//
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			obj = em.find(RDV.class, id);
//
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (tx != null) {
//				tx.rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//
//		return obj;
//	}
//
//	public RDV save(RDV obj) {
//		EntityManager em = null;
//		EntityTransaction tx = null;
//
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			obj = em.merge(obj);
//
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (tx != null) {
//				tx.rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//
//		return obj;
//	}
//
//	public void delete(RDV obj) {
//		EntityManager em = null;
//		EntityTransaction tx = null;
//
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			em.remove(em.merge(obj));
//
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (tx != null) {
//				tx.rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//	}

}
