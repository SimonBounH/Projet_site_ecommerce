package com.intiformation.siteecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intiformation.siteecommerce.dao.BoutiqueDAOImpl;
import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Produit;

@Service
public class InternauteServiceImpl implements InternauteService{

	BoutiqueDAOImpl boutiqueDAO;

	@Override
	public List<Categorie> findAllCategories() {
		
		return boutiqueDAO.listCategorie();
	}

	@Override
	public Categorie findCategorie(Long idCat) {
		return boutiqueDAO.getCategorie(idCat);
	}

	@Override
	public List<Produit> getAllProduits() {
		return boutiqueDAO.listproduits();
	}

	@Override
	public List<Produit> findProduitsParMotCle(String mc) {
		return boutiqueDAO.produitsParMotCle(mc);
	}

	@Override
	public List<Produit> findProduitsParCategorie(Long idCat) {
		return boutiqueDAO.produitsParCategorie(idCat);
	}

	@Override
	public List<Produit> listeProduitsSelectionnes() {
		
		return boutiqueDAO.produitsSelectionnes();
	}

	@Override
	public Produit findProduit(Long idP) {
			return boutiqueDAO.getProduit(idP);
	}
	


}
