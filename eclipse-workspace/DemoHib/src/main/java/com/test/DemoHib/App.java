package com.test.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App {
	public static void main(String[] args) {
		
		AlienName aaname =new AlienName();
		
		aaname.setFname("Harish");
		aaname.setLname("Sivanathan");
		
		Alien al = new Alien();
        al.setAid(101);
        al.setColor("Black");
        al.setAname(aaname);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(reg);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// al=(Alien) session.get(Alien.class, 102);
		session.save(al);
		tx.commit();
		System.out.println(al);
	}
}
