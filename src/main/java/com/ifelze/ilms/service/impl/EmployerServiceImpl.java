package com.ifelze.ilms.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.dao.EmployerDao;
import com.ifelze.ilms.model.Employer;
import com.ifelze.ilms.service.EmployerService;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerDao employerDao;
    
    @Override
    public Employer save(Employer employer) {
        return employerDao.save(employer);
    }

    @Override
    public List<Employer> findAll() {
        return employerDao.findAll();
    }

    @Override
    public Employer findByEmployerId(Long employerId) {
        return employerDao.findByEmployerId(employerId);
    }
    
    @Override
	public OpStatus delete(Long id) {
    	employerDao.delete(id);
		return OpStatus.SUCCESS;
	}
}
