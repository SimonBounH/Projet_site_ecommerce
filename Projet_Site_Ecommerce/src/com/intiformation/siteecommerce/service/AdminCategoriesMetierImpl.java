package com.intiformation.siteecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.intiformation.siteecommerce.dao.IBoutiqueDAO;
import com.intiformation.siteecommerce.modele.User;

public class AdminCategoriesMetierImpl implements IAdminCategoriesMetier {

	// déclaration du dao pour injection spring
	@Autowired
	private IBoutiqueDAO boutiqueDAO;
	
	/**
	 * setter pour injection spring 
	 * @param boutiqueDAO
	 */
	public void setBoutiqueDAO(IBoutiqueDAO boutiqueDAO) {
		this.boutiqueDAO = boutiqueDAO;
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub

	}

}
