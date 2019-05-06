package com.intiformation.siteecommerce.service;

import com.intiformation.siteecommerce.modele.Produit;

public interface AdminProduitService extends InternauteBoutiqueService {
	
	public void ajouterProduit(Produit p, long idCat);
	public void modifierProduit(Produit p);
	public void supprimerProduit(long idProd);

}
