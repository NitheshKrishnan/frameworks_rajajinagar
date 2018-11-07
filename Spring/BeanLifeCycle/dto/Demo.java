package org.jsp.springlifecycle.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean
{
	public Demo()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("calling destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("calling afterPropoertiesSet()");
	}	
}
