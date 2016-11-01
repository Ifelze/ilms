package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.Employer;

@Repository
public interface EmployerDao extends CrudRepository <Employer, Long> {
    List<Employer> findAll();

    Employer findByEmployerId(Long employerId);

    Employer save(Employer employer);
}
