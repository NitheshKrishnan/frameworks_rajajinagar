package org.jsp.beanwiringpackage.dto;

public class CPU 
{
	MotherBoard mB;
	Ram ram;
	HardDisk hd;
	
	public CPU(MotherBoard mB, Ram ram, HardDisk hd)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		
		this.mB = mB;
		this.ram = ram;
		this.hd = hd;
	}

	@Override
	public String toString() {
		return "CPU [mB=" + mB + ", ram=" + ram + ", hd=" + hd + "]";
	}
}
