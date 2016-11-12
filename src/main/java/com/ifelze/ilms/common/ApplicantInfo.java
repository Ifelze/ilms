package com.ifelze.ilms.common;

import java.util.Date;

import com.ifelze.ilms.constants.Gender;
import com.ifelze.ilms.constants.MaritalStatus;

public class ApplicantInfo {
	
	private String firstNsme;
	
    private String lastName;
    
    private String aadharNo;
    
    private Date dateOfBirth;
    
    private int phoneNo;
    
    private String email;
    
    private String drivingLicence;
    
    private Gender gender;
    
    private MaritalStatus status;

	public String getFirstNsme() {
		return firstNsme;
	}

	public void setFirstNsme(String firstNsme) {
		this.firstNsme = firstNsme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getStatus() {
		return status;
	}

	public void setStatus(MaritalStatus status) {
		this.status = status;
	}
}
