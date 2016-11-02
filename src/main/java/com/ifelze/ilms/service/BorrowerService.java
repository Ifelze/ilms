/**
 * 
 */
package com.ifelze.ilms.service;

import java.util.List;

import com.ifelze.ilms.constants.OpStatus;
import com.ifelze.ilms.model.Borrower;

/**
 * @author nithya
 *
 */
public interface BorrowerService {

	Borrower save(Borrower borrower);

	List<Borrower> findAll();

	Borrower findByBorrowerId(Long borrowerId);
	
	Borrower findByName(String borrowerName);
	
	OpStatus delete(Long borrowerId);

}
