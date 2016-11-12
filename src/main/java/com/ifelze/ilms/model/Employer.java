/**
 * 
 */
package com.ifelze.ilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ifelze.ilms.constants.PayFrequency;

/**
 * @author nithya
 *
 */

@Entity
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employerId;

	// Enter the name of the company name by which the borrower is employed
	private String companyName;

	// Mention the title of the job ex:CEO,Project Manager,Team Lead Etc.
	private String designation;

	private String phone;

	private int monthlyIncome;

	private Date joiningDate;

	private Date payDate;

	@OneToOne
	private Address address;

	private PayFrequency payFrequency;

	public long getEmployerId() {
		return employerId;
	}

	public void setEmployerId(long employerId) {
		this.employerId = employerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PayFrequency getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(PayFrequency payFrequency) {
		this.payFrequency = payFrequency;
	}
}
