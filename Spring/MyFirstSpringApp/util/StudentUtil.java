package org.jsp.setterpackage.util;

import org.jsp.setterpackage.dto.EmployeeDTO;
import org.jsp.setterpackage.dto.StudentDTO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentUtil
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
		StudentDTO s = (StudentDTO)context.getBean("s");
		
		EmployeeDTO e = (EmployeeDTO) context.getBean("e");
		
		e.m1();
		
		s.m1();
		
		context.close();
	}
}
