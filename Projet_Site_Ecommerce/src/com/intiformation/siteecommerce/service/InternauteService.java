package com.intiformation.siteecommerce.service;

import java.util.List;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.modele.User;

public interface InternauteService{
	public List<Categorie> findAllCategories();
	public Categorie findCategorie(Long idCat);
	public List<Produit> getAllProduits();
	public List<Produit> findProduitsParMotCle(String mc);
	public List<Produit> findProduitsParCategorie(Long idCat);
	public List<Produit> listeProduitsSelectionnes();
	public Produit findProduit(Long idP);
//	public Commande enregistrerCommande(GestionPanier p, Client c);
}
