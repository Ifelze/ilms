package com.ifelze.ilms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ifelze.ilms.constants.RequestedFrequency;

@Entity
public class LoanNumbers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesPrice;
	
	private int sellerFee;
	
	private int dmvFee;
	
	private int salesTax;
	
	private int accessories;
	
	private int gap;
	
	private int totalAmountRequested;
	
	private int creditLife;
	
	private int warranties;
	
	private int tradeIn;
	
	private int tradePayOff;
	
	private int netTrade;
	
	private int cashDown;
	
	private int deferredDown;
	
	private int rebate;
	
	private int totalDown;
	
	private RequestedFrequency frequency;
	
	private int requestedTerm;
	
	private int requestedPayment;

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getSellerFee() {
		return sellerFee;
	}

	public void setSellerFee(int sellerFee) {
		this.sellerFee = sellerFee;
	}

	public int getDmvFee() {
		return dmvFee;
	}

	public void setDmvFee(int dmvFee) {
		this.dmvFee = dmvFee;
	}

	public int getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(int salesTax) {
		this.salesTax = salesTax;
	}

	public int getAccessories() {
		return accessories;
	}

	public void setAccessories(int accessories) {
		this.accessories = accessories;
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) {
		this.gap = gap;
	}

	public int getTotalAmountRequested() {
		return totalAmountRequested;
	}

	public void setTotalAmountRequested(int totalAmountRequested) {
		this.totalAmountRequested = totalAmountRequested;
	}

	public int getCreditLife() {
		return creditLife;
	}

	public void setCreditLife(int creditLife) {
		this.creditLife = creditLife;
	}

	public int getWarranties() {
		return warranties;
	}

	public void setWarranties(int warranties) {
		this.warranties = warranties;
	}

	public int getTradeIn() {
		return tradeIn;
	}

	public void setTradeIn(int tradeIn) {
		this.tradeIn = tradeIn;
	}

	public int getTradePayOff() {
		return tradePayOff;
	}

	public void setTradePayOff(int tradePayOff) {
		this.tradePayOff = tradePayOff;
	}

	public int getNetTrade() {
		return netTrade;
	}

	public void setNetTrade(int netTrade) {
		this.netTrade = netTrade;
	}

	public int getCashDown() {
		return cashDown;
	}

	public void setCashDown(int cashDown) {
		this.cashDown = cashDown;
	}

	public int getDeferredDown() {
		return deferredDown;
	}

	public void setDeferredDown(int deferredDown) {
		this.deferredDown = deferredDown;
	}

	public int getRebate() {
		return rebate;
	}

	public void setRebate(int rebate) {
		this.rebate = rebate;
	}

	public int getTotalDown() {
		return totalDown;
	}

	public void setTotalDown(int totalDown) {
		this.totalDown = totalDown;
	}

	public RequestedFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(RequestedFrequency frequency) {
		this.frequency = frequency;
	}

	public int getRequestedTerm() {
		return requestedTerm;
	}

	public void setRequestedTerm(int requestedTerm) {
		this.requestedTerm = requestedTerm;
	}

	public int getRequestedPayment() {
		return requestedPayment;
	}

	public void setRequestedPayment(int requestedPayment) {
		this.requestedPayment = requestedPayment;
	}
}
