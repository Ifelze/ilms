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
import com.ifelze.ilms.model.CreditScoreTiers;
import com.ifelze.ilms.service.CreditScoreTierService;

@RestController
@RequestMapping("/creditScore")
public class CreditScoreTiersController {
	
	@Autowired
    private CreditScoreTierService creditScoreTierService;
	
	@RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public CreditScoreTiers newTier(@RequestBody CreditScoreTiers creditScoreTiers) throws
            ServletException {
    	return creditScoreTierService.save(creditScoreTiers);
    }
	
	@RequestMapping(value="{tierId}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditScoreTiers getCreditScore(@PathVariable("tierId") Long tierId){
    	return creditScoreTierService.findByTierId(tierId);
    }

	@RequestMapping(value="/remove/{tierId}",
	   		method = RequestMethod.DELETE,
	   		produces = MediaType.APPLICATION_JSON_VALUE)
	 public OpStatus removeCreditSore(@PathVariable("tierId") Long tierId){
	   	return creditScoreTierService.delete(tierId);
	 }

}
