package org.jsp.springwithoutxml.util;

import org.jsp.springwithoutxml.config.ForBeanConfig;
import org.jsp.springwithoutxml.dto.Demo;
import org.jsp.springwithoutxml.dto.Dummy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigutil 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ForBeanConfig.class);
		
		// Get the bean
		
		/*Demo d = context.getBean(Demo.class);
		
		Dummy du = context.getBean(Dummy.class);*/
		
		// close the container
		context.close();
	}
}
