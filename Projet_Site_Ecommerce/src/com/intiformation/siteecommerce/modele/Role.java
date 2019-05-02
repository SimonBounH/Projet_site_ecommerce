package com.intiformation.siteecommerce.modele;

public class Role {
	/*____________________PROPS__________________________*/
	private long idRole;
	private String roleName;
	
	/*____________________CTOR__________________________*/
	public Role() {
		super();
	}
	
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}
	
	public Role(long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
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
	
}
