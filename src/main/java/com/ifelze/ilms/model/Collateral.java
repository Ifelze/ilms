package com.ifelze.ilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collateral {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vinNumber;
	
	private String model;
	
	private String trim;
	
	private Date year;
	
	private String make;
	
	private int kilometers;

	public long getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(long vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
}
