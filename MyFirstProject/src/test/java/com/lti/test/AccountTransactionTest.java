package com.lti.test;

import java.util.List;

import org.junit.Test;
import com.lti.model.Account;
import com.lti.model.Transaction;
import com.lti.service.AccountService;

public class AccountTransactionTest {

	@Test
	public void testAccountCreation() {
		Account acc=new Account();
		acc.setAccNo(7777);
		acc.setAccHolderName("Pushpendra Singh");
		acc.setAccType("Saving");
		acc.setBalance(500000);
		AccountService add= new AccountService();
		add.openAccount(acc);
	}
	@Test
	public void testWithdraw() {
		AccountService add= new AccountService();
		add.withdraw(2222, 500000);
			
	}
	@Test
	public void testDeposit() {
		AccountService add= new AccountService();
		add.deposit(3333, 2500);
	}
	@Test
	public void testFundsTransfer() {
		AccountService add= new AccountService();
		add.fundsTransfer(2222, 3333, 10000);
	}
	
	@Test
	public void testCheckBalance() {
		AccountService bal= new AccountService();
		bal.checkBalance(1111);
	}
	
	@Test
	public void getAccountByType() {
		AccountService l1= new AccountService();
		List<Account> acc= l1.getAccountByType("Savings");
		for (Account account : acc) {
			System.out.println(account.getAccHolderName()+ " "+account.getAccNo());
			
		}		
	}
	
	
	@Test
	public void getMiniStatement() {
		AccountService l1= new AccountService();
		List<Transaction> txList= l1.miniStatement(3333);
		for (Transaction transaction : txList) {
			System.out.println(transaction.getTxNo()+" "+transaction.getDate());
		}
			
	
	}
}

