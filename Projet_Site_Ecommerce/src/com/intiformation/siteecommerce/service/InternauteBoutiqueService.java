package com.intiformation.siteecommerce.service;

import java.util.List;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Client;
import com.intiformation.siteecommerce.modele.Commande;
import com.intiformation.siteecommerce.modele.Panier;
import com.intiformation.siteecommerce.modele.Produit;

public interface InternauteBoutiqueService {
	
	/*_________________________ Catégorie ____________________*/
	public Categorie findCategorie(long idCat);
	public List<Categorie> findAllCategories();
	
	/*_________________________ Produit ______________________*/
	public Produit findProduit(long idProd);
	public List<Produit> getAllProduits();
	public List<Produit> findProduitsParMotCle(String mc);
	public List<Produit> findProduitsParCategorie(long idCat);
	public List<Produit> listeProduitsSelectionnes();
	
	public Commande enregistrerCommande(Panier p, Client c);
	
}
