package com.ibm.wallet.beans;

public class WalletAccount {
	private String userName;
	private String userId;
	private double balance;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "WalletAccount [userName=" + userName + ", userId=" + userId + ", balance=" + balance + "]";
	}

	
	
}
