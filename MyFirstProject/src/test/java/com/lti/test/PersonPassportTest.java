package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Passport;
import com.lti.model.Person;

public class PersonPassportTest {

	@Test
	public void addPerson() {
		Person ps= new Person();
		ps.setId(1);
		ps.setName("Sahil");
		ps.setAge(98);
		
		GenericDao aao=new GenericDao();
		aao.save(ps);
		
	}
	
	@Test
	public void assignPassportToAPerson() {
		
		GenericDao aao=new GenericDao();
		Person ps= (Person) aao.fetchById(Person.class, 1);
		Passport pp= new Passport();
		pp.setPassportNo("EPA15077");
		pp.setCountry("United KIngdom");
		pp.setIssueDate(LocalDate.of(2010, 10, 10));
		pp.setExpiryDate(LocalDate.of(2015, 10, 9));
		pp.setPerson(ps);
		
		aao.save(pp);
		
	}
	
	@Test
	public void addPersonAlongWithPassport() {
		
		Person ps=new Person();
		ps.setId(4);
		ps.setName("Chaitanya");
		ps.setAge(100);
	
		Passport pp= new Passport();
		pp.setPassportNo("CA15077");
		pp.setCountry("Canada");
		pp.setIssueDate(LocalDate.of(2000, 10, 10));
		pp.setExpiryDate(LocalDate.of(2012, 10, 9));

		pp.setPerson(ps);
		ps.setPassport(pp);
		
		GenericDao aao=new GenericDao();
		aao.save(ps);
	}
	
	@Test
	public void testUpdateAge(){
		
		GenericDao aao=new GenericDao();
		Person pso= (Person) aao.fetchById(Person.class,4);
		pso.setAge(20);
		aao.save(pso);
		
	}
		
}
