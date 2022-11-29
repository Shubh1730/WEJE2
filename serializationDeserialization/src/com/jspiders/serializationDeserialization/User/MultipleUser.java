package com.jspiders.serializationDeserialization.User;

import java.io.Serializable;

public class MultipleUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4312832594326496912L;

	int id;
	String userName;
	String password;

	public MultipleUser(int id, String userName, String password) {
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
