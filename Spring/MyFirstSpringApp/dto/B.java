package org.jsp.setterpackage.dto;

public class B 
{
	private int x;
	private int y;
	
	public B(int x, int y)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		
		this.x = x;
		this.y = y;
	}
	
	public B(int x)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		
		this.x = x;
		y = 1000;
	}

	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + "]";
	}
}
