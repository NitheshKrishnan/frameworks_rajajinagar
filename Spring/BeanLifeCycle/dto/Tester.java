package org.jsp.springlifecycle.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Tester implements InitializingBean,DisposableBean,BeanPostProcessor
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
	throws BeansException 
	{
		System.out.println("Before Initialization "+beanName);
		return bean;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("calling afterPropertiesSet()");
	}

	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("calling myInitMethod()");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
	throws BeansException 
	{
		System.out.println("After Initialization "+beanName);
		
		return bean;
	}
	
	@Override
	public void destroy() throws Exception
	{
		System.out.println("calling destroy()");
	}

	@PreDestroy
	public void myDestroyMethod()
	{
		System.out.println("calling myDestroyMethod()");
	}

}
