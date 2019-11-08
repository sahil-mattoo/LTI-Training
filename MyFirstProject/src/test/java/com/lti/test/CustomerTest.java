package com.lti.test;
import com.lti.model.*;
import com.lti.dao.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

//	@Test
//	public void testSaveData() {                //test whether data is inserted into DB or NOT
//		
//		Customer cust=new Customer();
//		cust.setCname("Nikhil");
//		cust.setCity("Amravati");
//		CustomerDao dao = new CustomerDao();
//		dao.save(cust);
//		
//	}
	
	@Test
	public void testFetchData(){
		
		CustomerDao dao = new CustomerDao();
		Customer cust=dao.fetch(99);   
		assertNotNull(cust);         //no printlns, we should use assert instead
		System.out.println(cust.getCname());
		System.out.println(cust.getCity());
		

	}

}
