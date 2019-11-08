package com.lti.test;
import com.lti.dao.UserAddressDao;
import com.lti.model.*;

import org.junit.Test;

public class UserTest {

//	public void testinsert() {
//		User us=new User();
//		
//		us.setName("Sahil");
//		us.setEmail("sahilmattoo14717");
//		us.setPassword("sahilroxx");
//	
//		UserAddressDao aao = new UserAddressDao();
//		aao.save(us);
//		
//	}
//	
//	public void addAddressforExistingUser() {
//		
//		UserAddressDao adrdao = new UserAddressDao();
//		User user=adrdao.fetch(121);
//		Address addr=new Address();
//		addr.setStreet("21B Baker Street");
//		addr.setCity("London");
//		addr.setCountry("United Kingdom");
//		addr.setPincode(558569);
//		
//		addr.setUser(user);
//		adrdao.saveAddr(addr);
//	}
	@Test
	public void addUserAlongWithAddress() {
		
		User us=new User();
		us.setName("iiikhikl");
		us.setEmail("222sdggdfd");
		us.setPassword("gbhjjk");
	
		UserAddressDao adrdao = new UserAddressDao();
		Address addr=new Address();
		addr.setUser(us);
		
		
		addr.setStreet("vaashi");
		addr.setCity("China");
		addr.setCountry("India");
		addr.setPincode(40005);
		
		
		adrdao.saveAddr(addr);
		
		
	}

	
	
	
}
