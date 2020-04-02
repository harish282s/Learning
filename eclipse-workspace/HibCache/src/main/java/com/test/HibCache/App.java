package com.test.HibCache;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Company cmp =null;
//		Company cmp = new Company();
//		cmp.setCid(101);
//		cmp.setCname("Wipro");
//		cmp.setClocation("Chennai");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Company.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		//using query
		Query q =session.createQuery("from Company where cid=1");
		
		//Query cache
		q.setCacheable(true);
		
		cmp =(Company) q.uniqueResult();
		
		//using cache
		//cmp =(Company) session.get(Company.class, 1);
		//session.save(cmp);
		
		System.out.println(cmp); 
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
		Query q1 =session2.createQuery("from Company where cid=1");
		
		//Query cache
		q1.setCacheable(true);
				
		cmp =(Company) q1.uniqueResult();
		session2.getTransaction().commit();
		
		
		//cmp =(Company) session2.get(Company.class, 1);

		//session2.save(cmp);
		System.out.println(cmp);
		//session2.getTransaction().commit();
		

		
	}
}
