package org.jspiders.onetomanymapping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="subjects_table")
public class SubjectDTO 
{
	@Id
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Column(name="id")
	private int id;
	@Column(name="subject_name")
	private String subjectName;
	
	public SubjectDTO()
	{
		
	}

	public SubjectDTO(String subjectName)
	{
		this.subjectName = subjectName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
