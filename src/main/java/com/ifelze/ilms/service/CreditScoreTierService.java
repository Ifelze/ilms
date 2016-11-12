package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.CreditScoreTiers;

public interface CreditScoreTierService {
	
	CreditScoreTiers save(CreditScoreTiers creditScoreTiers);

	List<CreditScoreTiers> findAll();

	CreditScoreTiers findByTierId(Long tierId);
	
	OpStatus delete(Long tierId);

}
