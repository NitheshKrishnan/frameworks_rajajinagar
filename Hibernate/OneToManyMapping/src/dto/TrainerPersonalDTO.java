package org.jspiders.onetomanymapping.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="trainer_personal")
public class TrainerPersonalDTO implements Serializable
{
	@Id
	@GenericGenerator(name="myGen",strategy="increment")
	@GeneratedValue(generator="myGen")
	@Column(name="id")
	private int id;
	@Column(name="mother_tongue")
	private String motherTongue;
	@Column(name="hometown")
	private String hometown;
	@Column(name="status")
	private String status;
	
	@OneToOne(mappedBy="personal")
	private TrainerDetailsDTO trainer;
	
	public TrainerPersonalDTO()
	{
		
	}
	
	public TrainerDetailsDTO getTrainer() {
		return trainer;
	}



	public void setTrainer(TrainerDetailsDTO trainer) {
		this.trainer = trainer;
	}



	public TrainerPersonalDTO(String motherTongue, String hometown, String status)
	{
		this.motherTongue = motherTongue;
		this.hometown = hometown;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TrainerPersonalDTO [id=" + id + ", motherTongue=" + motherTongue + ", hometown=" + hometown
				+ ", status=" + status + "]";
	}
}
