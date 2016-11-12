package com.ifelze.ilms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.CreditScoreTiersDao;
import com.ifelze.ilms.model.CreditScoreTiers;
import com.ifelze.ilms.service.CreditScoreTierService;

@Service
public class CreditScoreTierServiceImpl implements CreditScoreTierService{

	@Autowired
    private CreditScoreTiersDao creditScoreTiersDao;
	
	@Override
	   public CreditScoreTiers save(CreditScoreTiers creditScoreTier) {
        return creditScoreTiersDao.save(creditScoreTier);
    }

	@Override
    public List<CreditScoreTiers> findAll() {
        return creditScoreTiersDao.findAll();
    }

	@Override
    public CreditScoreTiers findByTierId(Long tierId) {
        return creditScoreTiersDao.findByTierId(tierId);
    }
	
	
	@Override
	public OpStatus delete(Long tierId) {
		creditScoreTiersDao.delete(tierId);
		return OpStatus.SUCCESS;
	}
}
