package com.ifelze.ilms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckListItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long driverLicence;
	
	private String signedCreditApp;
	
	private String varifiedIncome;
	
	private String varifiedRecidence;
	
	private String varifiedEmployment;
	
	private String pulledCredit;
	
	private String sentAdverseLetter;
	
	private String keyOnFile;
	
	private String gpsInstalled;
	
	private String checkedOFACList;

	public long getDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(long driverLicence) {
		this.driverLicence = driverLicence;
	}

	public String getSignedCreditApp() {
		return signedCreditApp;
	}

	public void setSignedCreditApp(String signedCreditApp) {
		this.signedCreditApp = signedCreditApp;
	}

	public String getVarifiedIncome() {
		return varifiedIncome;
	}

	public void setVarifiedIncome(String varifiedIncome) {
		this.varifiedIncome = varifiedIncome;
	}

	public String getVarifiedRecidence() {
		return varifiedRecidence;
	}

	public void setVarifiedRecidence(String varifiedRecidence) {
		this.varifiedRecidence = varifiedRecidence;
	}

	public String getVarifiedEmployment() {
		return varifiedEmployment;
	}

	public void setVarifiedEmployment(String varifiedEmployment) {
		this.varifiedEmployment = varifiedEmployment;
	}

	public String getPulledCredit() {
		return pulledCredit;
	}

	public void setPulledCredit(String pulledCredit) {
		this.pulledCredit = pulledCredit;
	}

	public String getSentAdverseLetter() {
		return sentAdverseLetter;
	}

	public void setSentAdverseLetter(String sentAdverseLetter) {
		this.sentAdverseLetter = sentAdverseLetter;
	}

	public String getKeyOnFile() {
		return keyOnFile;
	}

	public void setKeyOnFile(String keyOnFile) {
		this.keyOnFile = keyOnFile;
	}

	public String getGpsInstalled() {
		return gpsInstalled;
	}

	public void setGpsInstalled(String gpsInstalled) {
		this.gpsInstalled = gpsInstalled;
	}

	public String getCheckedOFACList() {
		return checkedOFACList;
	}

	public void setCheckedOFACList(String checkedOFACList) {
		this.checkedOFACList = checkedOFACList;
	}
}
