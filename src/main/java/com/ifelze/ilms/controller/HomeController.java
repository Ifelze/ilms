/**
 * 
 */
package com.ifelze.ilms.controller;

import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nithya
 *
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() throws
            ServletException {
    	return "home";
    }
    @RequestMapping("/login")
    public String loginPage() throws
            ServletException {
    	return "login";
    }
}
