package com.intiformation.siteecommerce.modele;

public class LigneCommande {
	
	/*____________________PROPS__________________________*/
	private int quantite;
	private int prix;
	
	/*____________________CTOR__________________________*/
	public LigneCommande() {
		super();
	}

	public LigneCommande(int prix) {
		super();
		this.prix = prix;
	}

	public LigneCommande(int quantite, int prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}
	
	/*____________________ENCAPSULATION__________________________*/
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
}
