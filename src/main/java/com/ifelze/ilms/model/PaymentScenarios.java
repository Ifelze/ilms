package com.ifelze.ilms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentScenarios {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scenarioNo;
	
	private long rate;
	
	private int term;
	
	private String frequency;
	
	private String firstPayment;
	
	private long underWritingFee;


	public long getScenarioNo() {
		return scenarioNo;
	}

	public void setScenarioNo(long scenarioNo) {
		this.scenarioNo = scenarioNo;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFirstPayment() {
		return firstPayment;
	}

	public void setFirstPayment(String firstPayment) {
		this.firstPayment = firstPayment;
	}

	public long getUnderWritingFee() {
		return underWritingFee;
	}

	public void setUnderWritingFee(long underWritingFee) {
		this.underWritingFee = underWritingFee;
	}
}
