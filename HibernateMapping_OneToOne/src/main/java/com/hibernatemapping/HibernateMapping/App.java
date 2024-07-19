package com.hibernatemapping.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Marks.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession(); 	
    	
    	session.beginTransaction();
    	
    	Student s1 = new Student();
    	s1.setName("Anosh");
    	s1.setRollno(1);
    	s1.setAddress("Pune");
    	session.save(s1);
    	

    	
    	Marks m1 = new Marks();
    	m1.setId(1);
    	m1.setEnglish(85);
    	m1.setMath(89);
    	m1.setStudent(s1);
    	session.save(m1);
    	
    	
    	
     	session.getTransaction().commit();
    	session.close();
    }
}    
