package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "panier")
@Table(name = "paniers")
public class Panier implements Serializable {
	
	/*____________________PROPS__________________________*/
	//Association
	private List<LigneCommande> listeCommandes;

	/*____________________CTOR__________________________*/
	public Panier() {
		super();
	}

	public Panier(List<LigneCommande> listeCommandes) {
		super();
		this.listeCommandes = listeCommandes;
	}

	/*____________________ENCAPSULATION__________________________*/
	public List<LigneCommande> getListeCommandes() {
		return listeCommandes;
	}
	
	public void setListeCommandes(List<LigneCommande> listeCommandes) {
		this.listeCommandes = listeCommandes;
	}	

}
