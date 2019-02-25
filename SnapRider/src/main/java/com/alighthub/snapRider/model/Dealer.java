package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dealer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dealerId;
	private String dealerFirstName;
	private String dealerAddress;
	private String dealerEmail;
	private int dealerMobileNumber;
	private String dealerPassword;
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerFirstName() {
		return dealerFirstName;
	}
	public void setDealerFirstName(String dealerFirstName) {
		this.dealerFirstName = dealerFirstName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}
	public int getDealerMobileNumber() {
		return dealerMobileNumber;
	}
	public void setDealerMobileNumber(int dealerMobileNumber) {
		this.dealerMobileNumber = dealerMobileNumber;
	}
	public String getDealerPassword() {
		return dealerPassword;
	}
	public void setDealerPassword(String dealerPassword) {
		this.dealerPassword = dealerPassword;
	}
	
	
	
	
	
	

}
