package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AxisBank implements Bank {
	
	@Autowired
	private Customer customer;
	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public void customerType()
	{
		System.out.println("AxisBank Customer:" +customer);
		
	}

	public void getInterest() {
		System.out.println("Axis Bank provides 12% Interest");
	}


	
}
