package org.jspiders.singletonsfpackage;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory
{
	private static SessionFactory factory;
	
	static
	{
		Configuration config = new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();
	}
	
	private SingletonFactory()
	{
		
	}
	
	public static SessionFactory getFactory()
	{
		return factory;
	}
}