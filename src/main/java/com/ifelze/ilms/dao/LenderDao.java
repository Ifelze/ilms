/**
 * 
 */
package com.ifelze.ilms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifelze.ilms.model.Lender;

/**
 * @author nithya
 *
 */
@Repository
public interface LenderDao extends CrudRepository <Lender, Long> {
    List<Lender> findAll();

    Lender findByLenderId(Long lenderId);

    Lender save(Lender lender);
    
    Lender findByName(String name);
}
