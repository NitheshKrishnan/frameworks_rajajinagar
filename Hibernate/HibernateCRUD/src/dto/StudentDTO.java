package org.jspiders.hibernatecrud.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_info")
public class StudentDTO implements Serializable
{
	
	@GenericGenerator(name="myGen",strategy="org.jspiders.hibernatecrud.dto.MyCustomGenerator")
	@Id
	@Column(name="id")
	@GeneratedValue(generator="myGen")
	private int id;
	@Column(name="fname")
	private String fName;
	@Column(name="lname")
	private String lName;
	@Column(name="marks")
	private double marks;
	
	public StudentDTO()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", fName=" + fName + ", lName=" + lName + ", marks=" + marks + "]";
	}
}
