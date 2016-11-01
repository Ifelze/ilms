/**
 * 
 */
package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Employer;

/**
 * @author nithya
 *
 */
public interface EmployerService {

	Employer save(Employer employer);

	List<Employer> findAll();

	Employer findByEmployerId(Long employerId);

	OpStatus delete(Long id);

}
