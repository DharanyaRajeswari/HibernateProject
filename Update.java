package com.demo;
import com.entity.Hotelreservationlog;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Update {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Hotelreservationlog hr = (Hotelreservationlog)session.get(Hotelreservationlog.class,49);
		  hr.setName("Sweety ");
		  hr.setAddress("Guragon ");
		  hr.setRoom_No(109);
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}
