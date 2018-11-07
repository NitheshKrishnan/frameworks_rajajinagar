package org.jsp.springwithoutxml.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Consumer
{
	@Autowired
	@Qualifier("led")
	Light l;
	
	public void display()
	{
		if(l!=null)
		{
			l.on();
			l.off();
		}
	}
}
