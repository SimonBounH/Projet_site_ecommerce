package com.intiformation.siteecommerce.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "role")
@Table(name = "roles")
public class Role implements Serializable {
	
	/*____________________PROPS__________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private long idRole;
	
	@Column(name = "role_name")
	private String roleName;
	
	//Association
	private User user;

	/*____________________CTOR__________________________*/
	public Role() {
		super();
	}

	public Role(String roleName, User user) {
		super();
		this.roleName = roleName;
		this.user = user;
	}

	public Role(long idRole, String roleName, User user) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
		this.user = user;
	}

	/*____________________ENCAPSULATION__________________________*/
	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
