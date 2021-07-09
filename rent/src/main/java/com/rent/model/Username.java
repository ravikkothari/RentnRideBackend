package com.rent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Username {

	@Id                                                                         
	@GeneratedValue(strategy = GenerationType.IDENTITY)                           
	private Integer userid; 
	
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Column(name="password")
    private String Password;
	
//	@Column(name="oldpassword")
//  private String Oldpassword;
	
	@Column(name="firstname")
    private String firstName;

	@Column(name="lastname")
    private String lastName;
	
	@Column(name="dob")
    private String Dob;
	
	@Column(name="gender")
    private String Gender;
	
	@Column(name="email")
    private String Email;
	
	@Column(name="phoneno")
    private Long phoneNo;
	
	@Column(name="aadhar")
    private String Aadhar;
	
	@Column(name="license")
    private String License;
	
	@Column(name="DOI")
	private String DOI; 
	
    @Column(name="address")
    private String Address;

   public Username() {}
    
	public Username(String firstName, String lastName, String password,String dob,
			String email, Long phoneNo, String aadhar, String license, String DOI,String address) {
		super();
		
		this.Password = password;
		//this.Oldpassword = oldpassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Dob = dob;
		this.Email = email;
		this.phoneNo = phoneNo;
		this.Aadhar = aadhar;
		this.License = license;
		this.DOI=DOI;
		this.Address = address;
	}

	
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	/*
	 * public String getOldpassword() { return Oldpassword; }
	 * 
	 * public void setOldpassword(String oldpassword) { Oldpassword = oldpassword; }
	 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAadhar() {
		return Aadhar;
	}

	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}

	public String getLicense() {
		return License;
	}

	public void setLicense(String license) {
		License = license;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


	public String getDOI() {
		return DOI;
	}

	public void setDOI(String dOI) {
		DOI = dOI;
	}
}