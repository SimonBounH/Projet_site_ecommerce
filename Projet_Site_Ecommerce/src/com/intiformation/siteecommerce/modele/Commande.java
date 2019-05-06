package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "commande")
@Table(name = "commandes")
public class Commande implements Serializable {
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_commande")
	private long idCommande;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_commande")
	private Date dateCommande;
	
	//Association
	private List<LigneCommande> listeLigneCommande;
	
	private Client client;
	
	private List<Produit> listeProduit;

	/*____________________CTOR__________________________*/
	public Commande() {
		super();
	}

	public Commande(Date dateCommande, List<LigneCommande> listeLigneCommande, Client client,
			List<Produit> listeProduit) {
		super();
		this.dateCommande = dateCommande;
		this.listeLigneCommande = listeLigneCommande;
		this.client = client;
		this.listeProduit = listeProduit;
	}

	public Commande(long idCommande, Date dateCommande, List<LigneCommande> listeLigneCommande, Client client,
			List<Produit> listeProduit) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.listeLigneCommande = listeLigneCommande;
		this.client = client;
		this.listeProduit = listeProduit;
	}

	/*____________________ENCAPSULATION__________________________*/
	public long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<LigneCommande> getListeLigneCommande() {
		return listeLigneCommande;
	}

	public void setListeLigneCommande(List<LigneCommande> listeLigneCommande) {
		this.listeLigneCommande = listeLigneCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
}