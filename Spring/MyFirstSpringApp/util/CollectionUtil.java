package org.jsp.setterpackage.util;

import org.jsp.setterpackage.dto.ForCollection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionUtil
{
	public static void main(String[] args)
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Get The BEan
		
		ForCollection fc = context.getBean(ForCollection.class);
		
		System.out.println(fc);
		
		// CLose the Container
		
		context.close();
	}
}
