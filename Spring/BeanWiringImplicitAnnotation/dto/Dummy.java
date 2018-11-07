package org.jsp.beanwiringannotation.dto;

import org.springframework.stereotype.Component;

@Component
public class Dummy
{
	public Dummy()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
