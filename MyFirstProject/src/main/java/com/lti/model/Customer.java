package com.lti.model;

import javax.persistence.*;


@Entity		//Compulsory Mandatory
@Table(name="TBL_CUST")				//naming the table, default it will guess
public class Customer {
	@Id							//provide an unique identification to Customer ID 
	@GeneratedValue				//optional
	@Column(name="CUST_ID")			//naming the column. if this annotation is not given default column name will be variable name.//optional
	int cid;
	
	@Column(name="CUST_NAME")	//naming the column //optional
	String cname;
	
	@Column(name="CUST_CITY")		//naming the column //optional
	String city;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}

}
