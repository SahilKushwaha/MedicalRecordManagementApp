package com.application.medapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medical_details",schema = "medicaldb")
public class MedicalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medical_id")
	private Integer medicalId;
	@Column(name = "height")
	private Double height;
	@Column(name = "weight")
	private Double weight;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "eye_sight")
	private String eyeSight;
	
	@OneToOne(mappedBy = "medicalEntity")
    private RecordEntity recordEntity;

	public Integer getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(Integer medicalId) {
		this.medicalId = medicalId;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEyeSight() {
		return eyeSight;
	}

	public void setEyeSight(String eyeSight) {
		this.eyeSight = eyeSight;
	}

	public RecordEntity getRecordEntity() {
		return recordEntity;
	}

	public void setRecordEntity(RecordEntity recordEntity) {
		this.recordEntity = recordEntity;
	}
	
	

}
