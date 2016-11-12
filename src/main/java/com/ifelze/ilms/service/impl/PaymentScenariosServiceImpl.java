package com.ifelze.ilms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.PaymentScenariosDao;
import com.ifelze.ilms.model.PaymentScenarios;
import com.ifelze.ilms.service.PaymentScenariosService;

@Service
public class PaymentScenariosServiceImpl implements PaymentScenariosService {

	@Autowired
	PaymentScenariosDao paymentScenarioDao;
	
	
	@Override
	public PaymentScenarios save(PaymentScenarios scenarios) {
		return paymentScenarioDao.save(scenarios);
	}

	@Override
	public PaymentScenarios findByScenarioId(Long senarioId) {
		return paymentScenarioDao.findByScenarioNo(senarioId);
	}

	@Override
	public OpStatus delete(long senarioId) {
		paymentScenarioDao.delete((int) senarioId);
		return OpStatus.SUCCESS;
	}

	
	
	
	

}
