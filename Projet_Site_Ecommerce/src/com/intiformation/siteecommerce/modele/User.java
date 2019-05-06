package com.intiformation.siteecommerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="user")
@Table(name="users")
public class User implements Serializable {
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_user")
	private long idUser;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "actived")
	private boolean actived;
	
	//Association
	private List<Role> listeRoles;

	/*____________________CTOR__________________________*/
	public User() {
		super();
	}

	public User(String userName, String password, boolean actived, List<Role> listeRoles) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
		this.listeRoles = listeRoles;
	}

	public User(long idUser, String userName, String password, boolean actived, List<Role> listeRoles) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.actived = actived;
		this.listeRoles = listeRoles;
	}

	/*____________________ENCAPSULATION__________________________*/
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public List<Role> getListeRoles() {
		return listeRoles;
	}

	public void setListeRoles(List<Role> listeRoles) {
		this.listeRoles = listeRoles;
	}
	
}