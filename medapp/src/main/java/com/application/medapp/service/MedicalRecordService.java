package com.application.medapp.service;

import java.util.List;

import com.application.medapp.entity.RecordEntity;
import com.application.medapp.model.Record;

public interface MedicalRecordService {
	
	public List<RecordEntity> getAllRecords();
	public void addRecord(Record record);
	public void updateRecord(Record record);
	public RecordEntity getRecordByAadhar(String aadharNumber);
	public String deleteRecord(String aadharNumber);

}
