package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.CustomForms;

@Repository
public interface CustomFormsDao extends CrudRepository<CustomForms, Integer>{
	
	CustomForms findByformId(int formId);

    List<CustomForms> findAll();

    CustomForms save(CustomForms address);
}
