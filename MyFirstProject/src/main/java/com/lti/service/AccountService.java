package com.lti.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.lti.dao.AccountDao;
import com.lti.dao.GenericDao;
import com.lti.model.Account;
import com.lti.model.Transaction;

public class AccountService {

	public void openAccount(Account acc){
		GenericDao dao=new GenericDao();
		dao.save(acc);
	}
	
	public void withdraw(int acno, double amount){
		GenericDao dao=new GenericDao();
		Account a=(Account)dao.fetchById(Account.class, acno);
		
		if(a.getBalance()>=amount)
		{
		Transaction tx= new Transaction();
		tx.setTxType("Debit");
		tx.setAmmount(amount);
		tx.setDate(LocalDateTime.now());
		a.setBalance((a.getBalance())-amount);
		tx.setAccount(a);
		
		dao.save(a);
		dao.save(tx);
		}
		else
			System.out.println("Insufficient Funds.");

	}
	
	public void deposit(int acno, double amount){
		GenericDao dao=new GenericDao();
		Account a=(Account)dao.fetchById(Account.class, acno);
		
		if(amount>0.0)
		{
		Transaction tx= new Transaction();
		tx.setTxType("Credit");
		tx.setAmmount(amount);
		tx.setDate(LocalDateTime.now());
		a.setBalance((a.getBalance())+amount);
		tx.setAccount(a);
		
		dao.save(a);
		dao.save(tx);
		}
		else
			System.out.println("Minimun depoit amount should be greater than Rs. 1");

	}

	public void fundsTransfer(int fromAcno, int toAcno, double amount){
	
		withdraw(fromAcno, amount);
		deposit(toAcno, amount);
		
	}

	public void checkBalance(int acno){
		GenericDao dao=new GenericDao();
		Account a=(Account)dao.fetchById(Account.class, acno);
		
		System.out.println("Balance is: Cr "+a.getBalance() );
		
	}

	public List <Account> getAccountByType(String type1){
		
		AccountDao accdao = new AccountDao();
		List <Account> a= accdao.fetchByType(type1);
		return a;
		
	}
	
	public List <Transaction> miniStatement(int accNo){
		
		AccountDao accdao = new AccountDao();
		List<Transaction> txList=accdao.fetchMiniStatement(accNo);
		return txList;
		
	}
	
	
}
