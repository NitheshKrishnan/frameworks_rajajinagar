package org.jsp.springwithoutxml.config;

import org.jsp.springwithoutxml.dto.Demo;
import org.jsp.springwithoutxml.dto.Dummy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ForBeanConfig
{
	@Bean
	public Demo getDemo()
	{
		return new Demo();
	}
	
	@Bean
	public Dummy getDummy()
	{
		return new Dummy();
	}
}
