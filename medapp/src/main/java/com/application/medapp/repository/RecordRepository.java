package com.application.medapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.application.medapp.entity.RecordEntity;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Integer> {

	@Query("Select re From RecordEntity re where re.aadharNumber = :aadharNumber")
	RecordEntity findByAadharNumber(@Param("aadharNumber") String aadharNumber);
	
	@Modifying
	@Query("DELETE FROM RecordEntity re WHERE re.aadharNumber = :aadharNumber")
	void deleteByAadharNumber(@Param("aadharNumber") String aadharNumber);
}
