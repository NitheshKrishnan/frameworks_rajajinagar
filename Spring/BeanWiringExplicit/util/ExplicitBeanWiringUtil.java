package org.jsp.beanwiringpackage.util;

import org.jsp.beanwiringpackage.dto.CPU;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExplicitBeanWiringUtil 
{
	public static void main(String[] args)
	{
		// Create the Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Get The Bean
		CPU cpu = context.getBean(CPU.class);
		
		System.out.println(cpu);
		
		//Close the Container
		context.close();
	}
}
