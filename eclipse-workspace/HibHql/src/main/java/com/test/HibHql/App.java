package com.test.HibHql;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Restaurant.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(reg);
		Session session = sf.openSession();
        session.beginTransaction();
        
        
        //To insert random values
//        Random r =new Random();
//        
//        for(int i=0;i<50;i++)
//        {
//        	Restaurant rt =new Restaurant();
//        	rt.setRid(i);
//        	rt.setRname("Name:"+i);
//        	rt.setRrating(r.nextInt(10));
//        	session.save(rt);
//        	System.out.println(rt);
//        }
        
        //List of values
//        Query q =session.createQuery("from Restaurant");
//        List<Restaurant> restaurants =q.list(); 
        
        //Unique Values
        Query q =session.createQuery(" from Restaurant where rid=5");
        Restaurant restaurants =(Restaurant) q.uniqueResult();
        
        System.out.println(restaurants);
        
//        for(Restaurant l :restaurants)
//        {
//        	System.out.println(l);
//        }
//        
		session.getTransaction().commit();
		
	}

    }

