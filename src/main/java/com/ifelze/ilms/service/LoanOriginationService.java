package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.LoanOrigination;

public interface LoanOriginationService {
	
	List<LoanOrigination> findAll();

	LoanOrigination save(LoanOrigination details);
	
	LoanOrigination findByNumber(Long number);
	
	OpStatus delete(Long id);

}
