/**
 * 
 */
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
import com.ifelze.ilms.model.Employer;
import com.ifelze.ilms.service.EmployerService;

/**
 * @author nithya
 *
 */
@RestController
@RequestMapping("/empr")
public class EmployerController {
	@Autowired
    private EmployerService employerService;

    @RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employer newAddr(@RequestBody Employer employer) throws
            ServletException {
    	return employerService.save(employer);
    }
    
    @RequestMapping(value="{id}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public Employer getEmployer(@PathVariable("id") Long employerId){
    	return employerService.findByEmployerId(employerId);
    }
    
    @RequestMapping(value="all",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employer> getAllEmployeres(){
    	return employerService.findAll();
    }
    @RequestMapping(value="/remove/{id}",
    		method = RequestMethod.DELETE,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public OpStatus removeEmployer(@PathVariable("id") Long employerId){
    	return employerService.delete(employerId);
    }
}
