package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue
	@Column(name="TRANSACTION_NUMBER")
	private int txNo;
	
	@Column(name="TRANSACTION_TYPE")
	private String txType;
	
	@Column(name="TRANSACTION_AMOUNT")
	private double ammount;
	
	@Column(name="TRANSACTION_DATE")
	private LocalDateTime date;
	
	@ManyToOne
	@JoinColumn(name="ACCOUNT_NUMBER", nullable=true)
	private Account account;

	public int getTxNo() {
		return txNo;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
