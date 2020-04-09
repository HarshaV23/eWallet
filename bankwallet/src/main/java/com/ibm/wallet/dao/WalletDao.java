package com.ibm.wallet.dao;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.ibm.wallet.beans.Transactions;
import com.ibm.wallet.beans.Transfers;

public interface WalletDao {
		public String createAccount(String userName,double balance);
		public double withdraw(double amount,String userId) throws AccountNotFoundException;
		public double deposit(double amount,String userId)throws AccountNotFoundException;
		public List<Transactions>trasaction(String userId)throws AccountNotFoundException;
		public double trasnfer(String senderId,String recieverId,double amount) throws AccountNotFoundException;
		public List<Transfers> transfers(String userId) throws AccountNotFoundException;

}
