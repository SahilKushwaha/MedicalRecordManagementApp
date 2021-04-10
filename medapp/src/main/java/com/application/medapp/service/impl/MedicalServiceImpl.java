package com.application.medapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.medapp.entity.MedicalEntity;
import com.application.medapp.model.Medical;
import com.application.medapp.repository.MedicalRepository;
import com.application.medapp.service.MedicalService;

@Service
public class MedicalServiceImpl implements MedicalService {

	@Autowired
	MedicalRepository medicalRepository;
	
	@Override
	public MedicalEntity addMedical(Medical medical) {
		MedicalEntity medicalEntity = new MedicalEntity();
		medicalEntity.setBloodGroup(medical.getBloodGroup());
		medicalEntity.setEyeSight(medical.getEyeSight());
		medicalEntity.setHeight(medical.getHeight());
		medicalEntity.setWeight(medical.getWeight());
		return medicalEntity;
	}

	@Override
	public void updateMedical(Medical medical) {
		MedicalEntity medicalEntity = new MedicalEntity();
		medicalEntity.setBloodGroup(medical.getBloodGroup());
		medicalEntity.setEyeSight(medical.getEyeSight());
		medicalEntity.setHeight(medical.getHeight());
		medicalEntity.setWeight(medical.getWeight());
		medicalRepository.save(medicalEntity);
		
	}

	@Override
	public String deleteMedical(String aadharNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
