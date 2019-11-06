package com.lti.app;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Customer cus=new Customer();
		cus.setCname("dhdfh");
		cus.setCity("dfgdfgdf");
		CustomerDao dao = new CustomerDao();
		dao.save(cus);*/
		
		
		CustomerDao dao = new CustomerDao();
		Customer cust=dao.fetch(22);         //check in DB
		System.out.println(cust.getCname());
		System.out.println(cust.getCity());
		
		
	}

}
