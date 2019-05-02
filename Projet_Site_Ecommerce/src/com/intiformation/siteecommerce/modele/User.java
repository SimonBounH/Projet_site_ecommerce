package com.intiformation.siteecommerce.modele;

public class User {
	/*____________________PROPS__________________________*/
	private long idUser;
	private String userName;
	private String password;
	private boolean activated;
	
	/*____________________CTOR__________________________*/
	public User() {
		super();
	}

	public User(String userName, String password, boolean activated) {
		super();
		this.userName = userName;
		this.password = password;
		this.activated = activated;
	}

	public User(long idUser, String userName, String password, boolean activated) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.activated = activated;
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

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
}
