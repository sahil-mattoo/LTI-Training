package com.lti.app;

import java.util.List;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		Customer cust=new Customer();
////		cust.setCname("Nikhil");
////		cust.setCity("Amravati");
////		CustomerDao dao = new CustomerDao();
////		dao.save(cust);
//		
//		
////		CustomerDao dao = new CustomerDao();
////		Customer cust=dao.fetch(22);         //check in DB
////		System.out.println(cust.getCname());
////		System.out.println(cust.getCity());
		
		CustomerDao dao = new CustomerDao();
		List<Customer> cust=dao.fetchByCity("Bangalore");     
		for(Customer c:cust){
			System.out.println(c);
		}

		
		
		
	}

}
