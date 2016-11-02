package com.ifelze.ilms.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.BorrowerDao;
import com.ifelze.ilms.model.Borrower;
import com.ifelze.ilms.service.BorrowerService;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerDao borrowerDao;
    
    @Override
    public Borrower save(Borrower borrower) {
        return borrowerDao.save(borrower);
    }

    @Override
    public List<Borrower> findAll() {
        return borrowerDao.findAll();
    }

    @Override
    public Borrower findByBorrowerId(Long borrowerId) {
        return borrowerDao.findByBorrowerId(borrowerId);
    }
    
    @Override
	public OpStatus delete(Long id) {
    	borrowerDao.delete(id);
		return OpStatus.SUCCESS;
	}

	@Override
	public Borrower findByName(String borrowerName) {
		return borrowerDao.findByName(borrowerName);
	}
}
