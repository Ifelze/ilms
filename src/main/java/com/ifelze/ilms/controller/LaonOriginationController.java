package com.ifelze.ilms.controller;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.LoanOrigination;
import com.ifelze.ilms.service.LoanOriginationService;

@RestController
@RequestMapping("/loanOrigination")
public class LaonOriginationController {
	
	@Autowired
	private LoanOriginationService loanOriginationSerivce;
	
	@RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoanOrigination  newApplicantDetails(@RequestBody LoanOrigination loanOrigination) throws
    ServletException {
		return loanOriginationSerivce.save(loanOrigination);
	}
	
	@RequestMapping(value="{number}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public LoanOrigination getApplicantDetails(@PathVariable("number") Long number){
    	return loanOriginationSerivce.findByNumber(number);
    }
	
	@RequestMapping(value="all",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LoanOrigination> getAllApplicantDetails(){
    	return loanOriginationSerivce.findAll();
    }
	
	@RequestMapping(value="/remove/{number}",
    		method = RequestMethod.DELETE,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public OpStatus removeApplicantDetails(@PathVariable("number") Long applicantId){
    	return loanOriginationSerivce.delete(applicantId);
    }
}
