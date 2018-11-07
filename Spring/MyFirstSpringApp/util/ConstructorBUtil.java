package org.jsp.setterpackage.util;

import org.jsp.setterpackage.dto.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBUtil 
{
	public static void main(String[] args)
	{
		// Create the Container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Get the Bean
		B b =(B) context.getBean("b");
		
		System.out.println(b);
		
		// close the Container
		context.close();
	}
}
