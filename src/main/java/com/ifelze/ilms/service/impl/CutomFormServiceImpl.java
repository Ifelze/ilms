package com.ifelze.ilms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.dao.CustomFormsDao;
import com.ifelze.ilms.model.CustomForms;
import com.ifelze.ilms.service.CustomFormsService;

@Service
public class CutomFormServiceImpl implements CustomFormsService{

	@Autowired
    private CustomFormsDao customFormDao;
	
	@Override
	public CustomForms save(CustomForms customForms) {
	return customFormDao.save(customForms);
	}
}
