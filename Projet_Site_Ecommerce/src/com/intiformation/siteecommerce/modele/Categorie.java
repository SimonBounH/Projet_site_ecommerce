package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity (name="categorie")
@Table(name="categories")
public class Categorie implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id_categorie")
	private Long idCategorie;
	@Column (name = "nom_categorie")
	private String nomCategorie;
	@Column (name = "description")
	private String description;
	@Lob
	@Column (name = "photo")
	private byte[] photo;
	@Column (name = "nom_photo")
	private String nomPhoto;
	
	
	
	
	
	
	
	public Categorie() {
		super();
	}
	
	public Categorie(String nomCategorie, String description, byte[] photo, String nomPhoto) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
		
	}
	public Categorie(Long idCategorie, String nomCategorie, String description, byte[] photo, String nomPhoto) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
	}
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
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

	
	
	
	
	
}

