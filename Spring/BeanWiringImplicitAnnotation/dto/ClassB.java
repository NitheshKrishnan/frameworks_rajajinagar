package org.jsp.beanwiringannotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassB 
{
	public ClassB()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	@Value("100")
	int x;

	@Override
	public String toString() 
	{
		return "ClassB [x=" + x + "]";
	}
}
