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
	
	@Transactional
	@Override
	public Long ajouterCategorie(Categorie c) {
		sessionFactory.getCurrentSession().save(c);
		return null;
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
		sessionFactory.getCurrentSession().delete(idcat);
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
