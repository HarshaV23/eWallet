package com.ibm.wallet.beans;

import java.sql.Time;

import java.util.Date;

public class Transactions {
	private String userId;
	private double amount;
	private String transType; 
	private Date timeStamp;
	
	public  String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "Transactions [amount=" + amount + ", transType=" + transType + ", timeStamp=" + timeStamp + "]";
	}

	
	
	

}
