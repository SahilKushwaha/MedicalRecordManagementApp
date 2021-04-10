package com.application.medapp.model;

import java.util.Date;
import java.util.Set;

public class Diagnosis {
	
	private Integer diagnosisId;
	private Date diagnosisDate;
	private String diagnosisCategory;
	private String diagnosisDetail;
	private Record record;
	private Set<Progress> progress;
	private Set<Drug> drug;
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
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public Set<Progress> getProgress() {
		return progress;
	}
	public void setProgress(Set<Progress> progress) {
		this.progress = progress;
	}
	public Set<Drug> getDrug() {
		return drug;
	}
	public void setDrug(Set<Drug> drug) {
		this.drug = drug;
	}
	@Override
	public String toString() {
		return "Diagnosis [diagnosisId=" + diagnosisId + ", diagnosisDate=" + diagnosisDate + ", diagnosisCategory="
				+ diagnosisCategory + ", diagnosisDetail=" + diagnosisDetail + ", record=" + record + ", progress="
				+ progress + ", drug=" + drug + "]";
	}
	public Diagnosis(Integer diagnosisId, Date diagnosisDate, String diagnosisCategory, String diagnosisDetail,
			Record record, Set<Progress> progress, Set<Drug> drug) {
		super();
		this.diagnosisId = diagnosisId;
		this.diagnosisDate = diagnosisDate;
		this.diagnosisCategory = diagnosisCategory;
		this.diagnosisDetail = diagnosisDetail;
		this.record = record;
		this.progress = progress;
		this.drug = drug;
	}
	public Diagnosis() {
		super();
	}
	
	

}
