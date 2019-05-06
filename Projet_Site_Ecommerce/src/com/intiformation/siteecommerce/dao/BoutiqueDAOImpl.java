package com.intiformation.siteecommerce.dao;


import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Client;
import com.intiformation.siteecommerce.modele.Commande;
import com.intiformation.siteecommerce.modele.Panier;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.modele.Role;
import com.intiformation.siteecommerce.modele.User;

/**
 * 
 * @author IN-MP-003
 *
 */
@Repository("boutiqueDaoBean")
public class BoutiqueDAOImpl implements IBoutiqueDAO {

	// déclaration de la session factory d'hibernate
	@Autowired // injection automaatique de la session factory
	private SessionFactory sessionFactory;
	
	/**
	 * setter de la sessionFactory pour permettre au conteneur 
	 * spring l'injection <br/>
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*________________________________________________________*/
	/*_________________________ Catégorie ____________________*/
	/*________________________________________________________*/
	
	@Override
	@Transactional
	public void ajouterCategorie(Categorie c) {
		sessionFactory.getCurrentSession().save(c);
	}

	@Override
	@Transactional
	public void modifierCategorie(Categorie c) {
		sessionFactory.getCurrentSession().update(c);
	}

	@Override
	@Transactional
	public void supprimerCategrorie(long idCat) {
		sessionFactory.getCurrentSession().delete(getCategorie(idCat));
	}

	@Override
	@Transactional
	public Categorie getCategorie(long idCat) {
		return sessionFactory.getCurrentSession().get(Categorie.class, idCat);
	}

	@Override
	@Transactional
	public List<Categorie> listCategorie() {
		return sessionFactory.getCurrentSession().createQuery("FROM categorie").list();
	}

	/*________________________________________________________*/
	/*_________________________ Produit ______________________*/
	/*________________________________________________________*/
	@Override
	@Transactional
	public void ajouterProduit(Produit p) {
		sessionFactory.getCurrentSession().save(p);
	}

	@Override
	@Transactional
	public void modifierProduit(Produit p) {
		sessionFactory.getCurrentSession().update(p);
	}

	@Override
	@Transactional
	public void supprimerProduit(long idProd) {
		sessionFactory.getCurrentSession().delete(getProduit(idProd));
	}

	@Override
	@Transactional
	public Produit getProduit(long idProd) {
		return sessionFactory.getCurrentSession().get(Produit.class, idProd);
	}

	@Override
	@Transactional
	public List<Produit> listProduit() {
		return sessionFactory.getCurrentSession().createQuery("FROM produit").list();
	}

	@Override
	@Transactional
	public List<Produit> produitsParMotCle(String mc) {
		return sessionFactory.getCurrentSession().createQuery("FROM produit p WHERE p.designation = :pDesignation").setParameter("pDesignation", mc).list();
	}

	@Override
	@Transactional
	public List<Produit> produitsParCategorie(long idCat) {
		return sessionFactory.getCurrentSession().createQuery("FROM produit p WHERE p.categorie = :pCategorie").setParameter("pCategorie", getCategorie(idCat)).list();
	}

	@Override
	@Transactional
	public List<Produit> produitsSelectionnes() {
		return sessionFactory.getCurrentSession().createQuery("FROM produit p WHERE p.selected = true").list();
	}

	/*________________________________________________________*/
	/*_____________________________ User _____________________*/
	/*________________________________________________________*/
	@Override
	@Transactional
	public void ajouterUser(User u) {
		sessionFactory.getCurrentSession().save(u);
	}

	@Override
	@Transactional
	public void modifierUser(User u) {
		sessionFactory.getCurrentSession().update(u);
	}

	@Override
	@Transactional
	public void supprimerUser(long idUser) {
		sessionFactory.getCurrentSession().delete(getUser(idUser));
	}

	@Override
	@Transactional
	public User getUser(long idUser) {
		return sessionFactory.getCurrentSession().get(User.class, idUser);
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		return sessionFactory.getCurrentSession().createQuery("FROM user").list();
	}

	@Override
	@Transactional
	public void attribuerRole(Role r, long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
