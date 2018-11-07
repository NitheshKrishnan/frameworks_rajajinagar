package org.jsp.springwithoutxml.dto;

import org.springframework.stereotype.Component;

public class Dummy 
{
	public Dummy()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}