package org.jsp.springwithoutxml.util;

import org.jsp.springwithoutxml.config.MyConfig;
import org.jsp.springwithoutxml.dto.Demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TesterUtil 
{
	public static void main(String[] args) 
	{
		// create the container
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);;
	
		// Get THe bean
		Demo d = context.getBean(Demo.class);
		
		//close the container
		context.close();
	}
}
