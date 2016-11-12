package com.ifelze.ilms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.CustomApplicatoinFieldsDao;
import com.ifelze.ilms.model.CustomApplicationFields;
import com.ifelze.ilms.service.CustomApplicationFieldsService;

@Service
public class CustomApplicationFieldsImpl implements CustomApplicationFieldsService{

	@Autowired
    private CustomApplicatoinFieldsDao customApplicationDao;
	@Override
	public CustomApplicationFields save(CustomApplicationFields customApplicantsDetails) {
		return customApplicationDao.save(customApplicantsDetails);
	}

	@Override
	public OpStatus delete(Long fieldId) {
		 customApplicationDao.delete(fieldId);
		return OpStatus.SUCCESS;
	 }
}
