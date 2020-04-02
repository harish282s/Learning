package com.test.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		
		//while using annotation --the class name should be in camel case if it has many words
//		 Bank bank =(Bank) context.getBean("stateBank");
//		 bank.getInterest();
		
		Bank bank =(Bank) context.getBean("axisBank");
     	bank.customerType();
		 
		
//		 Customer bank =(Customer) context.getBean("customer");
//		 bank.getCustomertype();
//		 System.out.println(bank);
		 
		 
		//Bank bank = new StateBank();
		//bank.getInterest();

		// AxisBank axisbank =new AxisBank();
		// axisbank.getInterest();
	}
}
