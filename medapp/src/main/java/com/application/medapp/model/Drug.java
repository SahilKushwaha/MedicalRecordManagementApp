package com.application.medapp.model;

import java.util.Set;

public class Drug {
	
	private Integer drugId;
	private String drugName;
	private String drugDetail;
	private Set<Diagnosis> diagnosis;
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
	public Set<Diagnosis> getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(Set<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	@Override
	public String toString() {
		return "Drug [drugId=" + drugId + ", drugName=" + drugName + ", drugDetail=" + drugDetail + ", diagnosis="
				+ diagnosis + "]";
	}
	public Drug(Integer drugId, String drugName, String drugDetail, Set<Diagnosis> diagnosis) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugDetail = drugDetail;
		this.diagnosis = diagnosis;
	}
	public Drug() {
		super();
	}

}
