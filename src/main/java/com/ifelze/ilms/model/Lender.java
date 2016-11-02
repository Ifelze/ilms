/**
 * 
 */
package com.ifelze.ilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

/**
 * @author nithya
 *
 */
@Entity
public class Lender {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long lenderId;

	private String name;
	
	private String password;
	
	@CreationTimestamp
    private Date registerDate;

	public long getLenderId() {
		return lenderId;
	}

	public void setLenderId(long lenderId) {
		this.lenderId = lenderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
}
