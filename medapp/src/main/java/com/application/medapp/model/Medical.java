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
	@Override
	public String toString() {
		return "Medical [medicalId=" + medicalId + ", height=" + height + ", weight=" + weight + ", bloodGroup="
				+ bloodGroup + ", eyeSight=" + eyeSight + "]";
	}
	public Medical(Integer medicalId, Double height, Double weight, String bloodGroup, String eyeSight) {
		super();
		this.medicalId = medicalId;
		this.height = height;
		this.weight = weight;
		this.bloodGroup = bloodGroup;
		this.eyeSight = eyeSight;
	}
	public Medical() {
		super();
	}
	
}
