package com.application.medapp.model;

import java.util.Date;

import com.application.medapp.entity.DiagnosisEntity;

public class Progress {
	
	private Integer progressId;
	private Date progressDate;
	private String progressDetail;
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
	@Override
	public String toString() {
		return "Progress [progressId=" + progressId + ", progressDate=" + progressDate + ", progressDetail="
				+ progressDetail + ", diagnosisEntity=" + diagnosisEntity + "]";
	}
	public Progress(Integer progressId, Date progressDate, String progressDetail, DiagnosisEntity diagnosisEntity) {
		super();
		this.progressId = progressId;
		this.progressDate = progressDate;
		this.progressDetail = progressDetail;
		this.diagnosisEntity = diagnosisEntity;
	}
	public Progress() {
		super();
	}

	
}
