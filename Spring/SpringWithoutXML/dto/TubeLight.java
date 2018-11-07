package org.jsp.springwithoutxml.dto;

import org.springframework.stereotype.Component;

@Component("tube")
public class TubeLight implements Light {

	@Override
	public void on() {
		System.out.println("TubeLight on");
	}

	@Override
	public void off() {
		System.out.println("TubeLight off");
	}

}
