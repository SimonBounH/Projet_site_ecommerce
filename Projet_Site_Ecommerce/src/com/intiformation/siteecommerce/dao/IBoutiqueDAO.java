package com.intiformation.siteecommerce.dao;


import java.util.List;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Client;
import com.intiformation.siteecommerce.modele.Commande;
import com.intiformation.siteecommerce.modele.Panier;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.modele.Role;
import com.intiformation.siteecommerce.modele.User;

public interface IBoutiqueDAO {

	/*_________________________ Catégorie __________________*/
	public void ajouterCategorie (Categorie c);
	public void modifierCategorie(Categorie c);
	public void supprimerCategrorie(long idCat);
	public Categorie getCategorie(long idCat);
	public List<Categorie> listCategorie();
	
	
	/*_________________________ Produit __________________*/
	public void ajouterProduit(Produit p);
	public void modifierProduit(Produit p);
	public void supprimerProduit(long idProd);
	public Produit getProduit(long idProd);
	public List<Produit> listProduit();
	
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(long idCat);
	public List<Produit> produitsSelectionnes();
	
	
	/*_________________________ User __________________*/
	public void ajouterUser(User u);
	public void modifierUser(User u);
	public void supprimerUser(long idUser);
	public User getUser(long idUser);
	public List<User> listUsers();
	
	
	public void attribuerRole(Role r, long userID);
	public Commande enregistrerCommande(Panier p, Client c);
	
}
