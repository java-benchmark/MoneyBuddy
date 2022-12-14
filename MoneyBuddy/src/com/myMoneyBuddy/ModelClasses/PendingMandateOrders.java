package com.myMoneyBuddy.ModelClasses;

import java.io.Serializable;

public class PendingMandateOrders implements Serializable{

	private String customerId;
	private String customerName;
	private String mandateId;
	private String mandateCreationDate;
	private String mandateAmount;
	
	
	public PendingMandateOrders() {

	}


	public PendingMandateOrders(String customerId, String customerName, String mandateId, String mandateCreationDate,
			String mandateAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mandateId = mandateId;
		this.mandateCreationDate = mandateCreationDate;
		this.mandateAmount = mandateAmount;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getMandateId() {
		return mandateId;
	}


	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}


	public String getMandateCreationDate() {
		return mandateCreationDate;
	}


	public void setMandateCreationDate(String mandateCreationDate) {
		this.mandateCreationDate = mandateCreationDate;
	}


	public String getMandateAmount() {
		return mandateAmount;
	}


	public void setMandateAmount(String mandateAmount) {
		this.mandateAmount = mandateAmount;
	}


}
