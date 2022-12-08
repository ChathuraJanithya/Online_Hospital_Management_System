package com.rec;

public class Receptionist {
	
	private int RID;
	private String user_name;
	private String password;
	private String contact;
	
	public Receptionist(int rID, String user_name, String password, String contact) {
		RID = rID;
		this.user_name = user_name;
		this.password = password;
		this.contact = contact;
	}

	/**
	 * @return the rID
	 */
	public int getRID() {
		return RID;
	}

	
	public String getUser_name() {
		return user_name;
	}

	
	public String getPassword() {
		return password;
	}

	public String getContact() {
		return contact;
	}

	
	
}
