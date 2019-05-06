package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity (name="categorie")
@Table(name="categories")
public class Categorie implements Serializable{
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id_categorie")
	private long idCategorie;
	
	@Column (name = "nom_categorie")
	private String nomCategorie;
	
	@Column (name = "description")
	private String description;
	
	@Lob
	@Column (name = "photo")
	private byte[] photo;
	
	@Column (name = "nom_photo")
	private String nomPhoto;
	
	//Association
	private List<Produit> listeProduit;
	
	/*____________________CTOR__________________________*/
	public Categorie() {
		super();
	}

	public Categorie(String nomCategorie, String description, byte[] photo, String nomPhoto,
			List<Produit> listeProduit) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
		this.listeProduit = listeProduit;
	}

	public Categorie(long idCategorie, String nomCategorie, String description, byte[] photo, String nomPhoto,
			List<Produit> listeProduit) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
		this.listeProduit = listeProduit;
	}

	/*____________________ENCAPSULATION__________________________*/
	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
}

