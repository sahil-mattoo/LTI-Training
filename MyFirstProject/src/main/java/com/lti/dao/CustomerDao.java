package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Customer;

// Data Access Object - Design Pattern
public class CustomerDao {

	public void save(Customer customer) {
		
		//Step 1. load/create EntityManagerFactory Object
		//During this step, META-INF/persistence.xml
		//file will be read automatically
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("oracleTest");
		
		//Step 2. Load/Create EntityManager Object
		EntityManager em = emf.createEntityManager();
		
		//Step 3. Participate/Start a Transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//Now we can insert/update/delete whatever we want
		//persist method generates insert query for us
		em.persist(customer);
		
		tx.commit();
		
		em.close();
		emf.close();
		
		
	}

	public Customer fetch(int cid) {
		
				EntityManagerFactory emf = 
						Persistence.createEntityManagerFactory("oracleTest");
				
				EntityManager em = emf.createEntityManager();
				
				//find method generate select query
				Customer cust=em.find(Customer.class, cid);
				
				em.close();
				emf.close();
		
				return cust;
		
	}
}
