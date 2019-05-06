package com.intiformation.siteecommerce.modele;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity (name="produit")
@Table(name="produits")
public class Produit implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column (name = "id_produit")
	private Long idProduit;
@Column (name = "designation")
	private String designation;
@Column (name = "description")
	private String description;
@Column (name = "prix")
	private double prix;
@Column (name = "quantite")
	private  int quantite;

@Column (name = "selected")

	private boolean selected;
	@Column (name = "photo")
	private String photo;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="categorie_id")
	private Categorie categorie;
	
	public Produit() {
		super();
	}
	public Produit(Long idProduit, String designation, String description, double prix, int quantite, boolean selected,
			String photo, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selected = selected;
		this.photo = photo;
		this.categorie = categorie;
	}
	public Produit(String designation, String description, double prix, int quantite, boolean selected, String photo,
			Categorie categorie) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selected = selected;
		this.photo = photo;
		this.categorie = categorie;
		
		
	}
	public Produit(String designation, String description, double prix, int quantite, boolean selected, String photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selected = selected;
		this.photo = photo;
	}
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
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
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
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", description=" + description
				+ ", prix=" + prix + ", quantite=" + quantite + ", selected=" + selected + ", photo=" + photo
				+ ", categorie=" + categorie + "]";
	}
	
	
}
