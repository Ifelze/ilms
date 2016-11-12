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
import com.ifelze.ilms.model.CustomApplicationFields;
import com.ifelze.ilms.service.CustomApplicationFieldsService;

@RestController
@RequestMapping("/fields")
public class CustomApplicationFieldsController {
		@Autowired
	    private CustomApplicationFieldsService customApplicationFieldsService;

	    @RequestMapping(value="new", 
	    		method = RequestMethod.POST, 
	    		produces = MediaType.APPLICATION_JSON_VALUE,
	    		consumes = MediaType.APPLICATION_JSON_VALUE)
	    public CustomApplicationFields newField(@RequestBody CustomApplicationFields customApplicationFields) throws
	            ServletException {
	    	return customApplicationFieldsService.save(customApplicationFields);
	    }
	
	    @RequestMapping(value="/remove/{fieldId}",
	    		method = RequestMethod.DELETE,
	    		produces = MediaType.APPLICATION_JSON_VALUE)
	    public OpStatus removeFields(@PathVariable("fieldId") Long fieldId){
	    	return customApplicationFieldsService.delete(fieldId);
	    }
	} 


