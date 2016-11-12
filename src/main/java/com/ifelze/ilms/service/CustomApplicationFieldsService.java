package com.ifelze.ilms.service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.CustomApplicationFields;

public interface CustomApplicationFieldsService {

	CustomApplicationFields save(CustomApplicationFields applicantsDetails);
	
	OpStatus delete(Long fieldId);
	
	
}
