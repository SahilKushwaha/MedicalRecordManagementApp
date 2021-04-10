package com.application.medapp.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "diagnosis_details",schema = "medicaldb")
public class DiagnosisEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "diagnosis_id")
	private Integer diagnosisId;
	@Column(name = "diagnosis_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date diagnosisDate; 
	@Column(name = "diagnosis_category")
	private String diagnosisCategory;
	@Column(name = "diagnosis_detail")
	private String diagnosisDetail;
	
	@ManyToOne
    @JoinColumn(name="patient_id", nullable=false)
	private RecordEntity recordEntity;
	
	@OneToMany(mappedBy = "diagnosisEntity")
	private Set<ProgressEntity> progressEntities;
	
	@ManyToMany
	@JoinTable(name = "diagnosis_prescription", joinColumns = @JoinColumn(name = "diag_id"), inverseJoinColumns = @JoinColumn(name = "drug_pres_id"))
	private Set<DrugEntity> drugEntities;

	public Integer getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(Integer diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public Date getDiagnosisDate() {
		return diagnosisDate;
	}

	public void setDiagnosisDate(Date diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public String getDiagnosisCategory() {
		return diagnosisCategory;
	}

	public void setDiagnosisCategory(String diagnosisCategory) {
		this.diagnosisCategory = diagnosisCategory;
	}

	public String getDiagnosisDetail() {
		return diagnosisDetail;
	}

	public void setDiagnosisDetail(String diagnosisDetail) {
		this.diagnosisDetail = diagnosisDetail;
	}

	public RecordEntity getRecordEntity() {
		return recordEntity;
	}

	public void setRecordEntity(RecordEntity recordEntity) {
		this.recordEntity = recordEntity;
	}

	public Set<ProgressEntity> getProgressEntities() {
		return progressEntities;
	}

	public void setProgressEntities(Set<ProgressEntity> progressEntities) {
		this.progressEntities = progressEntities;
	}

	public Set<DrugEntity> getDrugEntities() {
		return drugEntities;
	}

	public void setDrugEntities(Set<DrugEntity> drugEntities) {
		this.drugEntities = drugEntities;
	}

	public DiagnosisEntity(Integer diagnosisId, Date diagnosisDate, String diagnosisCategory, String diagnosisDetail,
			RecordEntity recordEntity, Set<ProgressEntity> progressEntities, Set<DrugEntity> drugEntities) {
		super();
		this.diagnosisId = diagnosisId;
		this.diagnosisDate = diagnosisDate;
		this.diagnosisCategory = diagnosisCategory;
		this.diagnosisDetail = diagnosisDetail;
		this.recordEntity = recordEntity;
		this.progressEntities = progressEntities;
		this.drugEntities = drugEntities;
	}

	public DiagnosisEntity() {
		super();
	}

	@Override
	public String toString() {
		return "DiagnosisEntity [diagnosisId=" + diagnosisId + ", diagnosisDate=" + diagnosisDate
				+ ", diagnosisCategory=" + diagnosisCategory + ", diagnosisDetail=" + diagnosisDetail
				+ ", recordEntity=" + recordEntity + ", progressEntities=" + progressEntities + ", drugEntities="
				+ drugEntities + "]";
	}
	
}
