package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.Address;
import com.ifelze.ilms.model.Borrower;
import com.ifelze.ilms.model.CustomApplicationFields;

@Repository
public interface CustomApplicatoinFieldsDao extends CrudRepository <CustomApplicationFields, Long>{
	
	List<CustomApplicationFields> findAll();
	
	CustomApplicationFields  findByFieldId(Long fieldId);
	
	CustomApplicationFields save(CustomApplicationFields customApplicationFields);
	
}
