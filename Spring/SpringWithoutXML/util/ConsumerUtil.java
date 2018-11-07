package org.jsp.springwithoutxml.util;

import org.jsp.springwithoutxml.config.MyConfig;
import org.jsp.springwithoutxml.dto.Consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsumerUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		// Get THe BEan
		Consumer c = context.getBean(Consumer.class);
		
		c.display();
		
		// close the Container
		context.close();
	}
}
