package com.ifelze.ilms.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.LenderDao;
import com.ifelze.ilms.model.Lender;
import com.ifelze.ilms.service.LenderService;

@Service
public class LenderServiceImpl implements LenderService {

    @Autowired
    private LenderDao lenderDao;
    
    @Override
    public Lender save(Lender lender) {
        return lenderDao.save(lender);
    }

    @Override
    public List<Lender> findAll() {
        return lenderDao.findAll();
    }

    @Override
    public Lender findByLenderId(Long lenderId) {
        return lenderDao.findByLenderId(lenderId);
    }
    
    @Override
	public OpStatus delete(Long id) {
    	lenderDao.delete(id);
		return OpStatus.SUCCESS;
	}

	@Override
	public Lender findByName(String lenderName) {
		return lenderDao.findByName(lenderName);
	}
}
