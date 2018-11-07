package org.jsp.beanwiringpackage.dto;

public class Ram
{
	private int size;
	private String name;
	
	public Ram()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ram [size=" + size + ", name=" + name + "]";
	}
}
