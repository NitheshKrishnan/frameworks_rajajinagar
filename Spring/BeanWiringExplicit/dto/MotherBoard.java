package org.jsp.beanwiringpackage.dto;

public class MotherBoard
{
	private String name;
	private int year;
	
	public MotherBoard()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MotherBoard [name=" + name + ", year=" + year + "]";
	}
}
