package com.rent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id                                                                         
	@GeneratedValue(strategy = GenerationType.AUTO)                           
	private long adminid;  

	@Column(name="adminEmail")
	private String adminEmail;

	@Column(name="adminPassword")
	private String adminPassword;






	public Admin(String adminEmail,String adminPassword) {
		super();
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;

	}





	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword + "]";
	}





	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}



	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

}
