package com.utility;
import java.util.Properties;

import com.entity.Hotelreservationlog;
import com.entity.Rooms;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
public class hibernateUtility {
	public static SessionFactory getSessionFactory() {

        Configuration configuration=new Configuration();
        Properties settings=new Properties();
        
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/htcn");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "Root");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        settings.put(Environment.SHOW_SQL, true);
        settings.put(Environment.FORMAT_SQL, true);
        settings.put(Environment.HBM2DDL_AUTO, "update");          
        
        configuration.setProperties(settings);
        
        configuration.addAnnotatedClass(Rooms.class);

        configuration.addAnnotatedClass(Hotelreservationlog.class);
        
        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        
        
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
	}
}
