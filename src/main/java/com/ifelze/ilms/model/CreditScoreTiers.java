package com.ifelze.ilms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditScoreTiers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tierId;
	
	private String title;
	
	private String minScore;
	
	private String maxScore;

	public long getTierId() {
		return tierId;
	}

	public void setTierId(long tierId) {
		this.tierId = tierId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMinScore() {
		return minScore;
	}

	public void setMinScore(String minScore) {
		this.minScore = minScore;
	}

	public String getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(String maxScore) {
		this.maxScore = maxScore;
	}
}
