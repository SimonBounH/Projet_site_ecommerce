package com.intiformation.siteecommerce.dao;


import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Client;
import com.intiformation.siteecommerce.modele.Commande;
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
	
	@Transactional
	@Override
	public void ajouterCategorie(Categorie c) {
		sessionFactory.getCurrentSession().save(c);
		
	}

	@Transactional(readOnly=true)
	@Override
	public List<Categorie> listCategorie() {
		return sessionFactory.getCurrentSession()
	             .createQuery("FROM categorie")
	             .list();
	}

	@Transactional(readOnly=true)
	@Override
	public Categorie getCategorie(Long idCat) {
		return sessionFactory.getCurrentSession()
				.get(Categorie.class, idCat);
	}

	@Transactional
	@Override
	public void supprimerCategrorie(Long idcat) {
		sessionFactory.getCurrentSession().delete(getCategorie(idcat));
		
	}
	
	@Transactional
	@Override
	public void modifierCategorie(Categorie c) {
		sessionFactory.getCurrentSession().update(c);	
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		
		p = new Produit(p.getDesignation(), p.getDescription(), p.getPrix(), p.getQuantite(), p.isSelected(), p.getPhoto(), getCategorie(idCat));
				
		sessionFactory.getCurrentSession().save(p);							
		return null;
	}

	@Override
	public List<Produit> listproduits() {
		
		return sessionFactory.getCurrentSession()
	             .createQuery("FROM produit")
	             .list();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		return sessionFactory.getCurrentSession()
	             .createQuery("FROM produit p WHERE p.designation = :pName").setParameter("pName", mc)
	             .list();
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		return sessionFactory.getCurrentSession()
	             .createQuery("FROM produit p WHERE p.idCategorie = :pIdCat").setParameter("pIdCat", idCat)
	             .list();
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		return sessionFactory.getCurrentSession()
	             .createQuery("FROM produit p WHERE p.selected = :pSelect").setParameter("pSelect", "TRUE")
	             .list();
	}

	@Override
	public Produit getProduit(Long idP) {
		return sessionFactory.getCurrentSession()
				.get(Produit.class, idP);
		
	}

	@Override
	public void supprimerProduit(Long idP) {
		sessionFactory.getCurrentSession().delete(getProduit(idP));
		
	}

	@Override
	public void modifierProduit(Produit p) {
		sessionFactory.getCurrentSession().update(p);
		
	}

	@Override
	public void ajouterUser(User u) {
		sessionFactory.getCurrentSession().save(u);
		
	}

//	@Override
//	public void attribuerRole(Role r, Long userID) {
//		
//		r = new Role();
//		
//		
//	}

	@Override
	public User getUser(Long idUser) {
		return sessionFactory.getCurrentSession()
				.get(User.class, idUser);
	}

//	@Override
//	public Commande enregistrerCommande(Panier p, Client c) {
//		return null;
//	}

}
