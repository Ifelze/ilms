package com.ifelze.ilms.controller;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifelze.ilms.model.Address;
import com.ifelze.ilms.model.CustomForms;
import com.ifelze.ilms.service.CustomFormsService;

@RestController
@RequestMapping("/customForms")
public class CustomFormsController {
	
	@Autowired
	 private CustomFormsService customFormsService;
	
	@RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomForms newAddr(@RequestBody CustomForms customForms) throws
            ServletException {
    	return customFormsService.save(customForms);
    }

}
