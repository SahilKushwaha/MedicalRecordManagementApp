package com.application.medapp.service.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.medapp.entity.RecordEntity;
import com.application.medapp.model.Record;
import com.application.medapp.repository.RecordRepository;
import com.application.medapp.service.MedicalRecordService;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	@Override
	public List<RecordEntity> getAllRecords() {
		List<RecordEntity> recordEntityList = new ArrayList<RecordEntity>();
		recordEntityList = recordRepository.findAll();
		for(RecordEntity recordEntity : recordEntityList) {
			setAge(recordEntity);
		}
		return recordEntityList;
	}

	@Override
	public void addRecord(Record record) {
		RecordEntity recordEntity = new RecordEntity();
		recordEntity.setFirstName(record.getFirstName());
		recordEntity.setMidName(record.getMidName());
		recordEntity.setLastName(record.getLastName());
		recordEntity.setGender(record.getGender());
		recordEntity.setDateOfBirth(record.getDateOfBirth());
		recordEntity.setAddress(record.getAddress());
		recordEntity.setPhoneNumber(record.getPhoneNumber());
		recordEntity.setIsMedInsuranceAvailable(record.getIsMedInsuranceAvailable());
		recordEntity.setAadharNumber(record.getAadharNumber());
		Date date = new Date();
		recordEntity.setLastUpdated(date);
		recordRepository.saveAndFlush(recordEntity);
	}

	@Override
	public void updateRecord(Record record) {
		RecordEntity recordEntity = recordRepository.findByAadharNumber(record.getAadharNumber());
		recordEntity.setFirstName(record.getFirstName());
		recordEntity.setMidName(record.getMidName());
		recordEntity.setLastName(record.getLastName());
		recordEntity.setGender(record.getGender());
		recordEntity.setDateOfBirth(record.getDateOfBirth());
		recordEntity.setAddress(record.getAddress());
		recordEntity.setPhoneNumber(record.getPhoneNumber());
		recordEntity.setIsMedInsuranceAvailable(record.getIsMedInsuranceAvailable());
		Date date = new Date();
		recordEntity.setLastUpdated(date);
		recordRepository.save(recordEntity);
	}

	@Override
	public RecordEntity getRecordByAadhar(String aadharNumber) {
		RecordEntity recordEntity = recordRepository.findByAadharNumber(aadharNumber);
		setAge(recordEntity);
		return recordEntity;
	}
	
	public void setAge(RecordEntity recordEntity) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.parse(recordEntity.getDateOfBirth(), formatter);
		Period age = Period.between(dob, today);
		recordEntity.setAge(age.getYears());
	}

	@Override
	@Transactional
	public String deleteRecord(String aadharNumber) {
		RecordEntity recordEntity = recordRepository.findByAadharNumber(aadharNumber);
		if (recordEntity != null) {
			recordRepository.deleteByAadharNumber(aadharNumber);
			return "Record Deleted Successfully";
		} else {
			return "Record does not exist";
		}
	}
}
