package com.application.medapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.medapp.entity.RecordEntity;
import com.application.medapp.model.Record;
import com.application.medapp.service.MedicalRecordService;

@RestController
public class MedController {
	
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	@GetMapping("/home")
	public String homePage() {
		return "HomePage";
	}
	
	@GetMapping("/getrecords")
	public List<RecordEntity> getAllRecords() {
		return this.medicalRecordService.getAllRecords(); 
	}
	
	@PostMapping("/addrecord")
	public String addRecord(@RequestBody Record record) {
		this.medicalRecordService.addRecord(record);
		return "Record Added Successfully";
	}
	
	@PutMapping("/updaterecord")
	public String updateRecord(@RequestBody Record record) {
		this.medicalRecordService.updateRecord(record);
		return "Record Updated Successfully";
	}
	
	@GetMapping("/getrecordbyaadhar/{aadharNumber}")
	public RecordEntity getRecord(@PathVariable String aadharNumber) {
		return this.medicalRecordService.getRecordByAadhar(aadharNumber);
	}
	
	@DeleteMapping("/deleterecordbyaadhar/{aadharNumber}")
	public String deleteRecord(@PathVariable String aadharNumber) {
		return this.medicalRecordService.deleteRecord(aadharNumber);
	}
	
}
