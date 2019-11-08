package com.lti.model;
import javax.persistence.*;

@Entity
@Table(name="TBL_USER")
public class User {
	
	@Id							
	@GeneratedValue				
	@Column(name="USER_ID")
	protected int id;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="USER_EMAIL", unique = true, columnDefinition="varchar2(80)")
	private String email;
	
	@Column(name="USER_PASS")
	private String password;

	//private Address address;       

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}