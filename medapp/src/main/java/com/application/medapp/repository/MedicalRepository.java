package com.application.medapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.medapp.entity.MedicalEntity;

@Repository
public interface MedicalRepository extends JpaRepository<MedicalEntity, Integer> {

}
