package com.ifelze.ilms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicantSettings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;
	
	private String applicantInfo;
	
	private String displayName;
	
	private String groupName;
	
	private String appShow;
	
	private String display;
		
	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantInfo() {
		return applicantInfo;
	}

	public void setApplicantInfo(String applicantInfo) {
		this.applicantInfo = applicantInfo;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getAppShow() {
		return appShow;
	}

	public void setAppShow(String appShow) {
		this.appShow = appShow;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}


}
