package org.jsp.implicitwiring.dto;

public class ClassB
{
	public ClassB()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
