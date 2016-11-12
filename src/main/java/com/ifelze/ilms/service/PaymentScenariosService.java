package com.ifelze.ilms.service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.PaymentScenarios;

public interface PaymentScenariosService {

	PaymentScenarios findByScenarioId(Long senarioId);
	
	PaymentScenarios save(PaymentScenarios scenarios);

	OpStatus delete(long senarioId);

}
