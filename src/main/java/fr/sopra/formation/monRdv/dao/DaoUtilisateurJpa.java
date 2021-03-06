//package fr.sopra.formation.monRdv.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//import javax.persistence.TypedQuery;
//
//import fr.sopra.formation.monRdv.App;
//import fr.sopra.formation.monRdv.beans.Utilisateur;
//import fr.sopra.formation.monRdv.dao.IDaoUtilisateur;
//
//public class DaoUtilisateurJpa implements IDaoUtilisateur {
//
//	@Override
//	public List<Utilisateur> findAll() {
//		List<Utilisateur> liste = null;
//		EntityManager em = null;
//		EntityTransaction tx = null;
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			TypedQuery<Utilisateur> query = em.createQuery("from Utilisateur", Utilisateur.class);
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
//	@Override
//	public Utilisateur find(Integer id) {
//		Utilisateur obj = null;
//		EntityManager em = null;
//		EntityTransaction tx = null;
//
//		try {
//			em = App.getInstance().getEmf().createEntityManager();
//			tx = em.getTransaction();
//			tx.begin();
//
//			obj = em.find(Utilisateur.class, id);
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
//	@Override
//	public Utilisateur save(Utilisateur obj) {
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
//	@Override
//	public void delete(Utilisateur obj) {
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
//
//}
