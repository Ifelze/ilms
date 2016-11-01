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
import com.ifelze.ilms.model.Address;
import com.ifelze.ilms.service.AddressService;

/**
 * @author nithya
 *
 */
@RestController
@RequestMapping("/addr")
public class AddressController {
	@Autowired
    private AddressService addressService;

    @RequestMapping(value="new", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public Address newAddr(@RequestBody Address address) throws
            ServletException {
    	return addressService.save(address);
    }
    
    @RequestMapping(value="{id}",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getAddress(@PathVariable("id") Long addressId){
    	return addressService.findByAddressId(addressId);
    }
    
    @RequestMapping(value="all",
    		method = RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Address> getAllAddresses(){
    	return addressService.findAll();
    }
    
    @RequestMapping(value="/remove/{id}",
    		method = RequestMethod.DELETE,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public OpStatus removeAddress(@PathVariable("id") Long addressId){
    	return addressService.delete(addressId);
    }
}
