package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="client")
@Table(name="clients")
public class Client implements Serializable {
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id_client")
	private long idClient;
	
	@Column (name = "nom_client")
	private String nomClient;
	
	@Column (name = "adresse")
	private String adresse;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "telephone")
	private String tel;
	
	//Association
	private List<Commande>  listeCommandes;
	
	/*____________________CTOR__________________________*/
	public Client() {
		super();
	}

	public Client(String nomClient, String adresse, String email, String tel, List<Commande> listeCommandes) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.listeCommandes = listeCommandes;
	}

	public Client(long idClient, String nomClient, String adresse, String email, String tel,
			List<Commande> listeCommandes) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.listeCommandes = listeCommandes;
	}
	
	/*____________________ENCAPSULATION__________________________*/
	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Commande> getListeCommandes() {
		return listeCommandes;
	}

	public void setListeCommandes(List<Commande> listeCommandes) {
		this.listeCommandes = listeCommandes;
	}

}
