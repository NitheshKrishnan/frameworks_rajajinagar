package org.jsp.beanscopepackage.util;

import org.jsp.beanscopepackage.dto.Demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtil
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Get THe bean
		Demo d1 = context.getBean(Demo.class);
		Demo d2 = context.getBean(Demo.class);
		Demo d3 = context.getBean(Demo.class);
		Demo d4 = context.getBean(Demo.class);
		
		System.out.println("d1 hashCOde() = "+d1.hashCode());
		System.out.println("d2 hashCOde() = "+d2.hashCode());
		System.out.println("d3 hashCOde() = "+d3.hashCode());
		System.out.println("d4 hashCOde() = "+d4.hashCode());
		
		// close the Container
		context.close();
	}
}
