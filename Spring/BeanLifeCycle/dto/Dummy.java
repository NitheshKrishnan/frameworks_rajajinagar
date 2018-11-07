package org.jsp.springlifecycle.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
public class Dummy
{
	public Dummy()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("calling myInitMethod()");
	}
	
	@PreDestroy
	public void myDestroyMethod()
	{
		System.out.println("calling myDestroyMethod()");
	}
}
