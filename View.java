package com.demo;
import java.util.List;

import com.entity.Hotelreservationlog;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
public class View {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<Hotelreservationlog> query1=session.createQuery("from Hotelreservationlog");
	         
	        List<Hotelreservationlog> result=query1.list();
	         
	         
	       for(Hotelreservationlog hr:result)
	      {
	       	System.out.println(hr.getName()); 
	       	System.out.println(hr.getCheck_in());
	       	System.out.println(hr.getRoom_No());

	         }

		  
		  
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();	

	}

}
