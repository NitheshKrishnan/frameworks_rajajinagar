package org.jsp.setterpackage.dto;

public class EmployeeDTO
{
	public EmployeeDTO()
	{
		System.out.println(this.getClass().getSimpleName()+ " Object Created");
	}
	
	public void m1()
	{
		System.out.println("inside m1() of EmployeeDTO");
	}
}
