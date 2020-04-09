package com.ibm.wallet.beans;

import java.util.Date;

public class Transfers {
	private String senderId,recieverId;
	private double amount;
	private Date timeStamp;
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getRecieverId() {
		return recieverId;
	}
	public void setRecieverId(String recieverId) {
		this.recieverId = recieverId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "Transfers [recieverId=" + recieverId + ", amount=" + amount + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
