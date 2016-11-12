package com.ifelze.ilms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.PaymentScenarios;

@Repository
public interface PaymentScenariosDao extends CrudRepository<PaymentScenarios, Integer>{
	
	PaymentScenarios save(PaymentScenarios scenarios);
	
	PaymentScenarios findByScenarioNo(Long senarioId);

	//void delete(Long scenarioNo);
	
}
