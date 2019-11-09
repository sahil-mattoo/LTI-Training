package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Account;
import com.lti.model.Customer;
import com.lti.model.Transaction;

public class AccountDao extends GenericDao{
	
	//SQL--> select * from account where account_type='Savings';
	//JPA--> select a from Account a where a.accType=: tp'
	
	
	public List <Account> fetchByType(String type){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		
		EntityManager em = emf.createEntityManager();
		
		Query q=em.createQuery("select a from Account a where a.accType=:tp");
		q.setParameter("tp", type);
		List <Account> accounts=q.getResultList( );
		em.close();
		emf.close();

		return accounts;
		
	}
	
	public List <Transaction> fetchMiniStatement(int accNo){
		
EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		
		EntityManager em = emf.createEntityManager();
		
		String ql="select t from Transaction t where t.account.accNo=:ac order by t.date desc";
		Query q =em.createQuery(ql);
		q.setParameter("ac", accNo);
		q.setMaxResults(5);
		List <Transaction> transactions = q.getResultList();
		return transactions;
		
		
				
	}
	
}
