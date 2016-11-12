package com.ifelze.ilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ifelze.ilms.constants.CaluculationType;
import com.ifelze.ilms.constants.LoanCategory;
import com.ifelze.ilms.constants.LoanType;
import com.ifelze.ilms.constants.PaymentFrequency;

@Entity
public class ApplicationDefaults {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;

	private LoanCategory loanCategory;
	
	private int underWritingFee;
	
	private int reserveAmount;
	
	private int term;
	
	private Date firstPaymentDate;
	
	private CaluculationType caluculationType;
	
	private int discountFee;
	
	private int interestRate;
	
	private PaymentFrequency paymentFrequency;
	
	private LoanType loanType;
	
	public long getApplicantionId() {
		return applicationId;
	}
	public void setApplicantionId(long applicantionId) {
		this.applicationId = applicantionId;
	}

	
	
	public int getUnderWritingFee() {
		return underWritingFee;
	}
	public LoanCategory getLoanCategory() {
		return loanCategory;
	}
	
	public void setLoanCategory(LoanCategory loanCategory) {
		this.loanCategory = loanCategory;
	}

	public void setUnderWritingFee(int underWritingFee) {
		this.underWritingFee = underWritingFee;
	}

	public int getReserveAmount() {
		return reserveAmount;
	}

	public void setReserveAmount(int reserveAmount) {
		this.reserveAmount = reserveAmount;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public CaluculationType getCaluculationType() {
		return caluculationType;
	}

	public void setCaluculationType(CaluculationType caluculationType) {
		this.caluculationType = caluculationType;
	}

	public int getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(int discountFee) {
		this.discountFee = discountFee;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
}
