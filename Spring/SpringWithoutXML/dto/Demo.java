package org.jsp.springwithoutxml.dto;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class Demo {
	
	public Demo()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

}