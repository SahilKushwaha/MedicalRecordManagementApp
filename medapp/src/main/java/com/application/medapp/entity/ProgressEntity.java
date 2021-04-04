package com.application.medapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "progress_details",schema = "medicaldb")
public class ProgressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "progress_id")
	private Integer progressId;
	@Column(name = "progress_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date progressDate;
	@Column(name = "progress_detail")
	private String progressDetail;
	
	@ManyToOne
    @JoinColumn(name="diagnosis_id", nullable=false)
	private DiagnosisEntity diagnosisEntity;

	public Integer getProgressId() {
		return progressId;
	}

	public void setProgressId(Integer progressId) {
		this.progressId = progressId;
	}

	public Date getProgressDate() {
		return progressDate;
	}

	public void setProgressDate(Date progressDate) {
		this.progressDate = progressDate;
	}

	public String getProgressDetail() {
		return progressDetail;
	}

	public void setProgressDetail(String progressDetail) {
		this.progressDetail = progressDetail;
	}

	public DiagnosisEntity getDiagnosisEntity() {
		return diagnosisEntity;
	}

	public void setDiagnosisEntity(DiagnosisEntity diagnosisEntity) {
		this.diagnosisEntity = diagnosisEntity;
	}
	
}
