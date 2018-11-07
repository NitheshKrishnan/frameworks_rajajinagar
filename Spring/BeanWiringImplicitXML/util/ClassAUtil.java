package org.jsp.implicitwiring.util;

import org.jsp.implicitwiring.dto.ClassA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassAUtil
{
	public static void main(String[] args)
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Get the Bean
		ClassA a = context.getBean(ClassA.class);
		
		System.out.println(a);
		
		// close the container
		context.close();
	}
}
