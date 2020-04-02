package com.test.HibMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {

		Laptop lp = new Laptop();
		Employee emp = new Employee();
		lp.setLid(101);
		lp.setLname("Macbook");
		lp.setEmployee(emp);
	
		
		emp.setEid(1);
		emp.setName("Harish");
		emp.setExp(7);
		//emp.setLaptop(lp);
		emp.getLaptop().add(lp);
		
		

		//lp.getEmployee().add(emp);
		
		

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(reg);
		Session session = sf.openSession();

		// Transaction tx = session.beginTransaction();
		session.beginTransaction();
		
		session.save(emp);
		session.save(lp);
		

		session.getTransaction().commit();

		// tx.commit();
		System.out.println(lp);
		System.out.println(emp);
	}
}
