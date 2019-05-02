package com.intiformation.siteecommerce.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.modele.User;

@Repository
public class BoutiqueDAOImpl implements IBoutiqueDAO {

	// déclaration de la session factory d'hibernate
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * setter pour injection spring <br/>
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void ajouterUser(User u) {
		sessionFactory.getCurrentSession().save(u);

	}

}
