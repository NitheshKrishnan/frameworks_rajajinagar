package org.jsp.springlifecycle.util;

import org.jsp.springlifecycle.dto.Dummy;
import org.jsp.springlifecycle.dto.Tester;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompleteLifeCycle
{
	public static void main(String[] args)
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
			
		// Get THe Bean
		Tester t = context.getBean(Tester.class);
		
		// CLose the Container
		context.close();
	}
}
