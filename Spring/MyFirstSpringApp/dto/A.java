package org.jsp.setterpackage.dto;

import java.util.Set;

public class A
{
	private int x;
	private int y;
	private Set st;
	
	public Set getSt() {
		return st;
	}

	public void setSt(Set st) {
		this.st = st;
	}

	public A()
	{
		System.out.println(this.getClass().getSimpleName()+ " Object Created");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", st=" + st + "]";
	}

	
}
