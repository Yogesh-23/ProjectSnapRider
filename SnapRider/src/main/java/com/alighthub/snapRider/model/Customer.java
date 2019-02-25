package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerEmailId;
	private String customerMobileNumber;
	private String customerPassword;
	private String customerAdharNumber;
	private String customerLicense;
	private String customerLocation;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerFirstName) {
		this.customerName = customerFirstName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmail) {
		this.customerEmailId = customerEmail;
	}
	public String getCustomerAdharNumber() {
		return customerAdharNumber;
	}
	public void setCustomerAdharNumber(String customerAdharNumber) {
		this.customerAdharNumber = customerAdharNumber;
	}
	public String getCustomerLicense() {
		return customerLicense;
	}
	public void setCustomerLicense(String customerLicense) {
		this.customerLicense = customerLicense;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
}
