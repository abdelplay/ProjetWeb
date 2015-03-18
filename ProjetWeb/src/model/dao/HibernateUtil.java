package model.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	
	
	private static  Configuration cfg ;
	private static SessionFactory sf ;
	
	private static Configuration getConfiguration(){ 
	
		if (cfg==null)
		cfg = new Configuration().configure();
		
		return cfg ;
	}
	
	public static SessionFactory getSessionFactory(){
		
		if (sf==null)
		sf = getConfiguration().buildSessionFactory();
		
		return sf;
	
	}
	
	
}
