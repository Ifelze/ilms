package com.ifelze.ilms.controller;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Address;
import com.ifelze.ilms.model.PaymentScenarios;
import com.ifelze.ilms.service.PaymentScenariosService;

@RestController
@RequestMapping("/payment")
public class PaymentScenariosController {
	
	@Autowired
    private PaymentScenariosService paymentScenarioService;


    @RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public PaymentScenarios newPaymentScenario(@RequestBody PaymentScenarios scenario) throws
            ServletException {
    	return paymentScenarioService.save(scenario);
    }
    
    @RequestMapping(value="{senarioId}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentScenarios getPaymentScenario(@PathVariable("senarioId") Long senarioId){
    	return paymentScenarioService.findByScenarioId(senarioId);
    }
    
    @RequestMapping(value="/remove/{senarioId}",
	   		method = RequestMethod.DELETE,
	   		produces = MediaType.APPLICATION_JSON_VALUE)
	 public OpStatus removeScenarioId(@PathVariable("senarioId") Long senarioId){
	   	return paymentScenarioService.delete(senarioId);
    }
}
