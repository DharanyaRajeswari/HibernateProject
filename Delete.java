package com.demo;
import com.entity.Hotelreservationlog;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Delete {

	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Hotelreservationlog hr = (Hotelreservationlog)session.load(Hotelreservationlog.class, 55);
		session.delete(hr);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}
