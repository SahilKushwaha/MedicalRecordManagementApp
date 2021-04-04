package com.application.medapp.model;

public class Medical {
	
	private Integer medicalId;
	private Double height;
	private Double weight;
	private String bloodGroup;
	private String eyeSight;
	
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
	
}
