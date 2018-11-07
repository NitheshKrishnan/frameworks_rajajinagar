package org.jsp.beanwiringpackage.dto;

public class HardDisk
{
	private int size;
	private String name;
	
	public HardDisk()
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
		return "HardDisk [size=" + size + ", name=" + name + "]";
	}
}
