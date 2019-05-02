package com.intiformation.siteecommerce.modele;

import java.util.Date;

public class Commande {
	
	/*____________________PROPS__________________________*/
	private long idCommande;
	private Date dateCommande;
	
	/*____________________CTOR__________________________*/
	public Commande() {
		super();
	}

	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	public Commande(long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
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
	
}
