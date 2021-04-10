package com.application.medapp.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.sun.istack.NotNull;

@Entity
@Table(name = "patient_details",schema = "medicaldb")
public class RecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Integer patientId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "middlename")
	private String midName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "gender")
	private String gender;
	@Transient
	private Integer age;
	@Column(name = "dob")
	private String dateOfBirth;
	@Column(name = "address")
	private String address;
	@Column(name = "mobile_number")
	private String phoneNumber;
	@Column(name = "medical_insurance")
	private String isMedInsuranceAvailable;
	@Column(name = "last_updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	@Column(name = "aadhar_number")
	private String aadharNumber;
	
	@OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "medical_id", referencedColumnName = "medical_id")
	private MedicalEntity medicalEntity;

	@OneToMany(mappedBy = "recordEntity")
	private Set<DiagnosisEntity> diagnosisEntities;
	
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
	public MedicalEntity getMedicalEntity() {
		return medicalEntity;
	}
	public void setMedicalEntity(MedicalEntity medicalEntity) {
		this.medicalEntity = medicalEntity;
	}
	public Set<DiagnosisEntity> getDiagnosisEntities() {
		return diagnosisEntities;
	}
	public void setDiagnosisEntities(Set<DiagnosisEntity> diagnosisEntities) {
		this.diagnosisEntities = diagnosisEntities;
	}
	@Override
	public String toString() {
		return "RecordEntity [patientId=" + patientId + ", firstName=" + firstName + ", midName=" + midName
				+ ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", isMedInsuranceAvailable="
				+ isMedInsuranceAvailable + ", lastUpdated=" + lastUpdated + ", aadharNumber=" + aadharNumber
				+ ", medicalEntity=" + medicalEntity + ", diagnosisEntities=" + diagnosisEntities + "]";
	}
	public RecordEntity(Integer patientId, String firstName, String midName, String lastName, String gender,
			Integer age, String dateOfBirth, String address, String phoneNumber, String isMedInsuranceAvailable,
			Date lastUpdated, String aadharNumber, MedicalEntity medicalEntity,
			Set<DiagnosisEntity> diagnosisEntities) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.isMedInsuranceAvailable = isMedInsuranceAvailable;
		this.lastUpdated = lastUpdated;
		this.aadharNumber = aadharNumber;
		this.medicalEntity = medicalEntity;
		this.diagnosisEntities = diagnosisEntities;
	}
	public RecordEntity() {
		super();
	}
	
}
