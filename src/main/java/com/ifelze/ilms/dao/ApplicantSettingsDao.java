package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.ApplicantSettings;

@Repository
public interface ApplicantSettingsDao extends CrudRepository <ApplicantSettings, String>{
	
	List<ApplicantSettings> findAll();

	ApplicantSettings save(ApplicantSettings applicantSettings);
}
