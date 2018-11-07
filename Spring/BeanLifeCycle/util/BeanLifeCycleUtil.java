package org.jsp.springlifecycle.util;

import org.jsp.springlifecycle.dto.Demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
		// Get THe Bean
		Demo d = context.getBean(Demo.class);
		
		// CLose the Container
		context.close();
	}
}
