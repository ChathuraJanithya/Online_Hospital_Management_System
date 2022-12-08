package com.rec;

public class Patient {
	private int pid;
	private String name;
	private String nic;
	private String contact;
	private String age;
	private String medical_unit;
	private String date;
	private String ward_Id;
	
	public Patient(int pid, String name, String nic, String contact, String age, String medical_unit, String date,
			String ward_Id) {
		this.pid = pid;
		this.name = name;
		this.nic = nic;
		this.contact = contact;
		this.age = age;
		this.medical_unit = medical_unit;
		this.date = date;
		this.ward_Id = ward_Id;
	}

	/**
	 * @return the pid
	 */
public int getPid() {
		return pid;
	}

	/**
	 * @return the name
	 */
public String getName() {
		return name;
	}


	/**
	 * @return the nic
	 */
public String getNic() {
		return nic;
	}

	/**
	 * @param nic the nic to set
	 */
	
public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	
	public String getMedical_unit() {
		return medical_unit;
	}

	/**
	 * @param medical_unit the medical_unit to set
	 */
	
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	
	public String getWard_Id() {
		return ward_Id;
	}


	
	
	
}
