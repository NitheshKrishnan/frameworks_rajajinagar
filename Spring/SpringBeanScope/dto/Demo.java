package org.jsp.beanscopepackage.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Demo
{
	public Demo() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
