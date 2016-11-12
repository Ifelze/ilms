package com.ifelze.ilms.controller;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifelze.ilms.model.ApplicantSettings;
import com.ifelze.ilms.service.ApplicantSettingsService;

@RestController
@RequestMapping("/settings")
public abstract class ApplicantSettingsController {
	
	@Autowired
    private ApplicantSettingsService applicantSettingsService;

    @RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public ApplicantSettings newAddr(@RequestBody ApplicantSettings settings) throws
            ServletException {
    	return applicantSettingsService.save(settings);
    }
}