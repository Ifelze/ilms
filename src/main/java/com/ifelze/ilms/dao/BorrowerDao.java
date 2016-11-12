/**
 * 
 */
package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.Borrower;

/**
 * @author nithya
 *
 */
@Repository
public interface BorrowerDao extends CrudRepository <Borrower, Long> {
   
	List<Borrower> findAll();

    Borrower findByBorrowerId(Long borrowerId);

    Borrower save(Borrower borrower);
    
    Borrower findByName(String name);
}
