package org.jsp.beanwiringannotation.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA
{
	public ClassA()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	ClassB b;

	public ClassB getB() {
		return b;
	}

	
	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [b=" + b + "]";
	}
}
