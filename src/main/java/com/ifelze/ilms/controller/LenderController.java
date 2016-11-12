package com.ifelze.ilms.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Lender;
import com.ifelze.ilms.service.LenderService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/lender")
public class LenderController {
    @Autowired
    private LenderService lenderService;

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String login(@RequestBody Map<String, String> json) throws
            ServletException {
        if(json.get("username") == null || json.get("password") ==null) {
            throw new ServletException("Please fill in username and password");
        }

        String userName = json.get("username");
        String password = json.get("password");

        Lender lender = lenderService.findByName(userName);
        if (lender == null) {
            throw new ServletException("User name not found.");
        }

        String pwd = lender.getPassword();

        if(!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password");
        }

        Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
        return OpStatus.SUCCESS.toString();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Lender registerLender(@RequestBody Lender lender) {
        return lenderService.save(lender);
    }
    
    @RequestMapping(value="{id}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public Lender getLender(@PathVariable("id") Long lenderId){
    	return lenderService.findByLenderId(lenderId);
    }
    
    @RequestMapping(value="all",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Lender> getAllLenderes(){
    	return lenderService.findAll();
    }
    
    @RequestMapping(value="/remove/{id}",
    		method = RequestMethod.DELETE,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public OpStatus removeLender(@PathVariable("id") Long lenderId){
    	return lenderService.delete(lenderId);
    }
}
