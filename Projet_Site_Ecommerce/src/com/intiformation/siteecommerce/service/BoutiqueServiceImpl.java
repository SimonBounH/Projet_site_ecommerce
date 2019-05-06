package com.intiformation.siteecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.siteecommerce.dao.IBoutiqueDAO;
import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Client;
import com.intiformation.siteecommerce.modele.Commande;
import com.intiformation.siteecommerce.modele.Panier;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.modele.Role;
import com.intiformation.siteecommerce.modele.User;

@Service("boutiqueServiceBean")
public class BoutiqueServiceImpl implements AdminCategorieService {
	
	@Autowired
	private IBoutiqueDAO boutiqueDAO;

	public void setBoutiqueDAO(IBoutiqueDAO boutiqueDAO) {
		this.boutiqueDAO = boutiqueDAO;
	}
	
	/*________________________________________________________*/
	/*_________________________ Produit ______________________*/
	/*________________________________________________________*/
	@Override
	public void ajouterProduit(Produit p, long idCat) {
		p.setCategorie(boutiqueDAO.getCategorie(idCat));
		boutiqueDAO.ajouterProduit(p);
	}

	@Override
	public void modifierProduit(Produit p) {
		boutiqueDAO.modifierProduit(p);
	}

	@Override
	public void supprimerProduit(long idProd) {
		boutiqueDAO.supprimerProduit(idProd);
	}
	
	@Override
	public Produit findProduit(long idProd) {
		return boutiqueDAO.getProduit(idProd);
	}

	@Override
	public List<Produit> getAllProduits() {
		return boutiqueDAO.listProduit();
	}

	@Override
	public List<Produit> findProduitsParMotCle(String mc) {
		return boutiqueDAO.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> findProduitsParCategorie(long idCat) {
		return boutiqueDAO.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> listeProduitsSelectionnes() {
		return boutiqueDAO.produitsSelectionnes();
	}

	/*________________________________________________________*/
	/*_________________________ Catégorie ____________________*/
	/*________________________________________________________*/
	@Override
	public void ajouterCategorie(Categorie c) {
		boutiqueDAO.ajouterCategorie(c);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		boutiqueDAO.modifierCategorie(c);
	}

	@Override
	public void supprimerCategrorie(long idCat) {
		boutiqueDAO.produitsParCategorie(idCat);
	}
	
	@Override
	public Categorie findCategorie(long idCat) {
		return boutiqueDAO.getCategorie(idCat);
	}

	@Override
	public List<Categorie> findAllCategories() {
		return boutiqueDAO.listCategorie();
	}

	/*________________________________________________________*/
	/*_________________________ User _________________________*/
	/*________________________________________________________*/
	@Override
	public void ajouterUser(User u) {
		boutiqueDAO.ajouterUser(u);
	}
	
	@Override
	public void attribuerRole(Role r, long userID) {
		boutiqueDAO.attribuerRole(r, userID);
	}
	
	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		return boutiqueDAO.enregistrerCommande(p, c);
	}

}
