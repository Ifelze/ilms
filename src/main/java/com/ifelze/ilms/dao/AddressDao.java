package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.Address;

@Repository
public interface AddressDao extends CrudRepository <Address, Long> {
    List<Address> findAll();

    Address findByAddressId(Long addressId);

    Address save(Address address);
}