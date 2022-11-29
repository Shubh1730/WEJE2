package com.jspiders.serializationDeserialization.User;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7489674967521887508L;
	
	int id;
	String userName;
	String password;
	
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id =" + id + ", userName = " + userName + ", password = " + password + " ]";
	}
}
