package com.application.medapp.model;

import java.util.Date;

public class Record {
	
	private Integer patientId;
	private String firstName;
	private String midName;
	private String lastName;
	private String gender;
	private Integer age;
	private String dateOfBirth;
	private String address;
	private String phoneNumber;
	private String isMedInsuranceAvailable;
	private Date lastUpdated;
	private String aadharNumber;
	private Medical medical;
	
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIsMedInsuranceAvailable() {
		return isMedInsuranceAvailable;
	}
	public void setIsMedInsuranceAvailable(String isMedInsuranceAvailable) {
		this.isMedInsuranceAvailable = isMedInsuranceAvailable;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Medical getMedical() {
		return medical;
	}
	public void setMedical(Medical medical) {
		this.medical = medical;
	}
	
	
}
