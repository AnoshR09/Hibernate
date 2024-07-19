package com.hibernatemapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatemappingonetomany.Documents;
import com.hibernatemappingonetomany.User;




public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Documents.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession(); 	
    	
    	session.beginTransaction();	
    	
     	    	
    	User u1 = new User();
    	u1.setUserId(102);
    	u1.setName("Nikita");
    	u1.setAddress("Pune, NIBM");
    	
    	User u2 = new User();
    	u2.setUserId(103);
    	u2.setName("Joel");
    	u2.setAddress("Pune, Talegaon");
    	
    
    	session.save(u1);
    	session.save(u2);
    	
    	
    	Documents d = new Documents();
    	d.setId(111);
    	d.setNumber("ABC2124Z");
    	d.setType("PAN");
    	
    	Documents d1 = new Documents();
    	d1.setId(112);
    	d1.setNumber("48342124284");
    	d1.setType("Adhaar");
    	  	
    	session.save(d);
    	session.save(d1);
    	
    	User u = new User();
    	u.setUserId(101);
    	u.setName("Anosh");
    	u.setAddress("Pune, Hadapsar");
       	
    	List<Documents> docs = new ArrayList<Documents>();
    	docs.add(d);
    	docs.add(d1);
    	
    	
    	u.setDocuments(docs);

    	session.save(u);
    	    	
     	session.getTransaction().commit();
    	session.close();
    }
}    
