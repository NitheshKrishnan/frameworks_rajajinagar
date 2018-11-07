package org.jsp.springlifecycle.util;

import org.jsp.springlifecycle.dto.Demo;
import org.jsp.springlifecycle.dto.Dummy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDirectiveUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
		// Get THe Bean
		Dummy dum = context.getBean(Dummy.class);
		
		// CLose the Container
		context.close();
	}
}
