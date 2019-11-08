package com.lti.model;

import javax.persistence.*;

@Entity
@Table(name="TBL_ADDRESS")
public class Address {
	
	@Id							
	@GeneratedValue				
	@Column(name="ADDRESS_ID")
	private int id;
	
	@Column(name="ADDRESS_STREET")
	private String street;

	@Column(name="ADDRESS_CITY")
	private String city;
	
	@Column(name="ADDRESS_COUNTRY")
	private String country;
	
	@Column(name="ADDRESS_PINCODE")
	private int pincode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")      //fk
	private User user;        		 //unidirectional mapping

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + ", pincode="
				+ pincode + ", user=" + user + "]";
	}

	
}