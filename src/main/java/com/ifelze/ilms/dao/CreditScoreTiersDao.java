package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.CreditScoreTiers;

@Repository
public interface CreditScoreTiersDao extends CrudRepository <CreditScoreTiers, Long>{
	
	List<CreditScoreTiers> findAll();

	CreditScoreTiers findByTierId(Long tierId);

}
