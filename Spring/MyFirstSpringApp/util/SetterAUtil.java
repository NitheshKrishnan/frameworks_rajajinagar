package org.jsp.setterpackage.util;

import org.jsp.setterpackage.dto.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAUtil
{
	public static void main(String[] args)
	{
		// Creation of Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
		// Get the Bean
		A a = (A)context.getBean("a");
	
		System.out.println("Contents of A");
		System.out.println(a);
		
		// close the Container
		context.close();
	}
}
