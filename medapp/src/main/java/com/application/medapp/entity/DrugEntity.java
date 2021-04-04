package com.application.medapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "drug_details",schema = "medicaldb")
public class DrugEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drug_id")
	private Integer drugId;
	@Column(name = "drug_name")
	private String drugName;
	@Column(name = "drug_detail")
	private String drugDetail;
	
	@ManyToMany(mappedBy = "drugEntities")
	private Set<DiagnosisEntity> diagnosisEntities;

	public Integer getDrugId() {
		return drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugDetail() {
		return drugDetail;
	}

	public void setDrugDetail(String drugDetail) {
		this.drugDetail = drugDetail;
	}

	public Set<DiagnosisEntity> getDiagnosisEntities() {
		return diagnosisEntities;
	}

	public void setDiagnosisEntities(Set<DiagnosisEntity> diagnosisEntities) {
		this.diagnosisEntities = diagnosisEntities;
	}
	
}
