package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "produit")
@Table(name = "produits")
public class Produit implements Serializable {

	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produit")
	private Long idProduit;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "prix")
	private double prix;

	@Column(name = "selected")
	private boolean selected;
	
	@Column(name = "photo")
	private String photo;
	
	//Association
	private Categorie categorie;
	
	private List<Commande> listeCommande;
	
	private LigneCommande ligneCommande;

	/*____________________CTOR__________________________*/
	public Produit() {
		super();
	}

	public Produit(String designation, String description, double prix, boolean selected, String photo,
			Categorie categorie, List<Commande> listeCommande, LigneCommande ligneCommande) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.categorie = categorie;
		this.listeCommande = listeCommande;
		this.ligneCommande = ligneCommande;
	}

	public Produit(Long idProduit, String designation, String description, double prix, boolean selected, String photo,
			Categorie categorie, List<Commande> listeCommande, LigneCommande ligneCommande) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.categorie = categorie;
		this.listeCommande = listeCommande;
		this.ligneCommande = ligneCommande;
	}

	/*____________________ENCAPSULATION__________________________*/
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Commande> getListeCommande() {
		return listeCommande;
	}

	public void setListeCommande(List<Commande> listeCommande) {
		this.listeCommande = listeCommande;
	}

	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

}
