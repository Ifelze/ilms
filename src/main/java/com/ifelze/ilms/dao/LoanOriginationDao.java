package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.LoanOrigination;

@Repository
public interface LoanOriginationDao extends CrudRepository <LoanOrigination, Long>{
	
	List<LoanOrigination> findAll();

	LoanOrigination findByNumber(Long number);
	
	LoanOrigination save(LoanOrigination applicantDetails);
	
}