package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StateBank implements Bank {
	
	//Auto wire example
	 @Autowired
	 private Customer customer;

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public void getInterest()
	{
		
		System.out.println("State Bank provides 11% Interest");
	}
	
	public void customerType()
	{
		System.out.println("StateBank Customer:" +customer);
		
	}
}

