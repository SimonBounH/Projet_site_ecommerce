package com.intiformation.siteecommerce.service;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Role;
import com.intiformation.siteecommerce.modele.User;

public interface AdminCategorieService extends AdminProduitService {
	
	public void ajouterCategorie(Categorie c);
	public void modifierCategorie(Categorie c);
	public void supprimerCategrorie(long idCat);
	
	public void ajouterUser(User u);
	public void attribuerRole(Role r, long userID);

}
