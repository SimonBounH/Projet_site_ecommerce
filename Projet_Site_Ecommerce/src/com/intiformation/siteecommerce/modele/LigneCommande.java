package com.intiformation.siteecommerce.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="ligneCommande")
@Table(name="lignes_commandes")
public class LigneCommande implements Serializable {
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_ligne_commande")
	private long idLigneCommande;
	
	@Column(name = "quantite")
	private int quantite;
	
	@Column(name = "prix")
	private double prix;
	
	
	//Association
	private Commande commande;
	
	private Produit produit;
	
	private Panier panier;

	/*____________________CTOR__________________________*/
	public LigneCommande() {
		super();
	}

	public LigneCommande(int quantite, double prix, Commande commande, Produit produit, Panier panier) {
		super();
		this.quantite = quantite;
		this.prix = prix;
		this.commande = commande;
		this.produit = produit;
		this.panier = panier;
	}

	public LigneCommande(long idLigneCommande, int quantite, double prix, Commande commande, Produit produit,
			Panier panier) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.quantite = quantite;
		this.prix = prix;
		this.commande = commande;
		this.produit = produit;
		this.panier = panier;
	}

	/*____________________ENCAPSULATION__________________________*/
	public long getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(long idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
}
