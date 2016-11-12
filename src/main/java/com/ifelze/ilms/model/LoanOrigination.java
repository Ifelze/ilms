package com.ifelze.ilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class LoanOrigination {

	@CreationTimestamp
	private Date date;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long number;
	
	private String applicantName;
	
	private String credit;
	
	private String collateral;
	
	private String user;
	
	private Long approved;
	
	private String status;
	
	private String autoApproved;
	
	@CreationTimestamp
	private Date apvDate;
	
	private String book;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}	

	public String getCollateral() {
		return collateral;
	}
	
	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Long getApproved() {
		return approved;
	}

	public void setApproved(Long approved) {
		this.approved = approved;
	}	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAutoApproved() {
		return autoApproved;	
	}	

	public void setAutoApproved(String autoApproved) {
		this.autoApproved = autoApproved;
	}

	public Date getApvDate() {
		return apvDate;
	}

	public void setApvDate(Date apvDate) {
		this.apvDate = apvDate;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
}