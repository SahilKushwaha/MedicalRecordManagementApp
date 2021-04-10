package com.application.medapp.service;

import com.application.medapp.entity.MedicalEntity;
import com.application.medapp.model.Medical;

public interface MedicalService {
	
	public MedicalEntity addMedical(Medical medical);
	public void updateMedical(Medical medical);
	public String deleteMedical(String aadharNumber);

}
