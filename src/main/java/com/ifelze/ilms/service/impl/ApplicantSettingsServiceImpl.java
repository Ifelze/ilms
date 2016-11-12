package com.ifelze.ilms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.dao.ApplicantSettingsDao;
import com.ifelze.ilms.model.ApplicantSettings;
import com.ifelze.ilms.service.ApplicantSettingsService;

@Service
public class ApplicantSettingsServiceImpl implements ApplicantSettingsService{

	@Autowired
	private ApplicantSettingsDao applicantSettingsDao;
	@Override
	public ApplicantSettings save(ApplicantSettings settings) {
		return applicantSettingsDao.save(settings);
	}
	

}
