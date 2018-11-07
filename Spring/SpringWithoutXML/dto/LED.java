package org.jsp.springwithoutxml.dto;

import org.springframework.stereotype.Component;

@Component("led")
public class LED implements Light
{
	@Override
	public void on() {
		System.out.println("LED on");
	}

	@Override
	public void off() {
		System.out.println("LED off");
	}
}
