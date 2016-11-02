/**
 * 
 */
package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Lender;

/**
 * @author nithya
 *
 */
public interface LenderService {

	Lender save(Lender lender);

	List<Lender> findAll();

	Lender findByLenderId(Long lenderId);
	
	Lender findByName(String lenderName);
	
	OpStatus delete(Long lenderId);

}
