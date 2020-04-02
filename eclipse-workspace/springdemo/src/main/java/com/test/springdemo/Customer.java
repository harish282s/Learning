package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    
	private String customertype;

	// using constructor for constructor injection
//	public Customer(String customertype) {
//		super();
//		this.customertype = customertype;
//	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;

	}

	/*
	 * @Override public String toString() { return "customer [customertype=" +
	 * customertype + "]";
	 * 
	 */
	@Override
	public String toString() {
		return "customer is premium";
	}

}
