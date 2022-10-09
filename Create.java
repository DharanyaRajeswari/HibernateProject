package com.demo;
import java.time.LocalDate;


import com.entity.Hotelreservationlog;
import com.entity.Rooms;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Create {

	public static void main(String[] args) {
		 SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
        LocalDate Check_in=LocalDate.now() ;
        LocalDate Check_out=LocalDate.now() ;
        
        Hotelreservationlog hr = new Hotelreservationlog();
        hr.setName("Tanavi");
        hr.setAddress("Banglore");
        hr.setMobile_no((long) 99864356);
        hr.setCheck_in(Check_in);
        hr.setChech_out(Check_out);
        hr.setRoom_No(109);
        
        hr.setName("Ankit");
        hr.setAddress("Hyderabad");
        hr.setMobile_no((long) 67584689);
        hr.setCheck_in(Check_in);
        hr.setChech_out(Check_out);
        hr.setRoom_No(107);
        
        hr.setName("Srinu");
        hr.setAddress("Chennai");
        hr.setMobile_no((long) 906579087);
        hr.setCheck_in(Check_in);
        hr.setChech_out(Check_out);
        hr.setRoom_No(108);
        
        hr.setName("Varshini");
        hr.setAddress("Mumbai");
        hr.setMobile_no((long) 98765432);
        hr.setCheck_in(Check_in);
        hr.setChech_out(Check_out);
        hr.setRoom_No(110);
        
        
        
        
        Rooms rooms=new Rooms();
        rooms.setRoom_No(109);
        rooms.setRoom_Type("Non-AC");
        rooms.setBed_Type("DoubleBed");
        rooms.setAmount(5000);
        
        rooms.setRoom_No(107);
        rooms.setRoom_Type("AC");
        rooms.setBed_Type("SingleBed");
        rooms.setAmount(2000);
        
        rooms.setRoom_No(108);
        rooms.setRoom_Type("Non-AC");
        rooms.setBed_Type("SingleBed");
        rooms.setAmount(2000);
        
        rooms.setRoom_No(110);
        rooms.setRoom_Type("AC");
        rooms.setBed_Type("SingleBed");
        rooms.setAmount(2000);
        
        
        
        hr.setRooms(rooms);
        session.save(hr);

        session.save(rooms);
        
        
        
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

        }

	}

