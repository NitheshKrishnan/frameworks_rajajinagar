package org.jspiders.onetoonemapping.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trainer_details")
public class TrainerDetailsDTO implements Serializable
{
	@Id
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Column(name="id")
	private int id;
	@Column(name="fname")
	private String fName;
	@Column(name="lname")
	private String lName;
	@Column(name="experience")
	private int experience;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_personal_details_id")
	TrainerPersonalDTO personal;

	public TrainerDetailsDTO()
	{
		
	}
	
	public TrainerDetailsDTO(String fName, String lName, int experience)
	{
		this.fName = fName;
		this.lName = lName;
		this.experience = experience;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public TrainerPersonalDTO getPersonal() {
		return personal;
	}

	public void setPersonal(TrainerPersonalDTO personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "TrainerDetailsDTO [id=" + id + ", fName=" + fName + ", lName=" + lName + ", experience=" + experience
				+ "]";
	}
}
