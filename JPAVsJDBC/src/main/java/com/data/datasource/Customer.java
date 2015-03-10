package com.data.datasource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CUSTOMER")
public class Customer {
	
	
	@Id 
	private int CustomerID;
	
	private String CustomerName;
	
	private int CustomerSalary;
	
	private int CustomerAge;
	
	public Customer() {	}

	public Customer(Integer CustomerID, String CustomerName, int CustomerSalary,
			int CustomerAge) {
		this.CustomerID = CustomerID; 
		this.CustomerName = CustomerName;
		this.CustomerSalary = CustomerSalary;
		this.CustomerAge = CustomerAge;
	}

	 
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomerSalary() {
		return CustomerSalary;
	}

	public void setCustomerSalary(int customerSalary) {
		CustomerSalary = customerSalary;
	}

	public int getCustomerAge() {
		return CustomerAge;
	}

	public void setCustomerAge(int customerAge) {
		CustomerAge = customerAge;
	}	
}

