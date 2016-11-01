/**
 * 
 */
package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Address;

/**
 * @author nithya
 *
 */
public interface AddressService {

	Address save(Address address);

	List<Address> findAll();

	Address findByAddressId(Long addressId);
	
	OpStatus delete(Long id);

}
