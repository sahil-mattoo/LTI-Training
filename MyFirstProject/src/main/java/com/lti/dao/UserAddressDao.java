package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.User;

public class UserAddressDao {
public void save( User user) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("oracleTest");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(user);
		
		tx.commit();
		
		em.close();
		emf.close();
		
	}

public void saveAddr(Address add) {
	
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("oracleTest");
	
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	
	em.persist(add);
	
	tx.commit();
	
	em.close();
	emf.close();
	
}


	public User fetch(int cid) {
		
		EntityManagerFactory emf = 
						Persistence.createEntityManagerFactory("oracleTest");
				
		EntityManager em = emf.createEntityManager();
				
		User uk=em.find(User.class, cid);
				
		em.close();
		emf.close();
		
		return uk;
		
	}
	
//	
//	public List<Customer> fetchByCity(String city) {
//		
//		EntityManagerFactory emf = 
//				Persistence.createEntityManagerFactory("oracleTest");
//		
//		EntityManager em = emf.createEntityManager();
//		
//		//find method generate select query
//		Query q=em.createQuery("select t from Customer as t where t.city=:ct");
//		q.setParameter("ct",city);
//		List <Customer> customers=q.getResultList( );
//		em.close();
//		emf.close();
//
//		return customers;
//	}
//	
}
