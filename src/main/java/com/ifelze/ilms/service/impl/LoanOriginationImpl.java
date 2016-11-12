package com.ifelze.ilms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.LoanOriginationDao;
import com.ifelze.ilms.model.LoanOrigination;
import com.ifelze.ilms.service.LoanOriginationService;

@Service
public class LoanOriginationImpl implements LoanOriginationService{

	@Autowired
	private LoanOriginationDao loanOriginationDao; 
	@Override
	public List<LoanOrigination> findAll() {
		return loanOriginationDao.findAll();
	}

	@Override
	public LoanOrigination save(LoanOrigination details) {
		return loanOriginationDao.save(details);
	}

	@Override
	public LoanOrigination findByNumber(Long number) {
		return loanOriginationDao.findByNumber(number);
	}

	@Override
	public OpStatus delete(Long number) {
		loanOriginationDao.delete(number);
		return OpStatus.SUCCESS;
	}
}
