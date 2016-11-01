/**
 * 
 */
package com.ifelze.ilms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.AddressDao;
import com.ifelze.ilms.model.Address;
import com.ifelze.ilms.service.AddressService;

/**
 * @author nithya
 *
 */
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
    private AddressDao addressDao;
	/* (non-Javadoc)
	 * @see com.ifelze.ilms.service.AddressService#save(com.ifelze.ilms.model.Address)
	 */
	@Override
	public Address save(Address address) {
		return addressDao.save(address);
	}

	/* (non-Javadoc)
	 * @see com.ifelze.ilms.service.AddressService#findAll()
	 */
	@Override
	public List<Address> findAll() {
		return addressDao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.ifelze.ilms.service.AddressService#findByAddressId(java.lang.Long)
	 */
	@Override
	public Address findByAddressId(Long addressId) {
		return addressDao.findByAddressId(addressId);
	}

	@Override
	public OpStatus delete(Long id) {
		addressDao.delete(id);
		return OpStatus.SUCCESS;
	}
	
	
}
