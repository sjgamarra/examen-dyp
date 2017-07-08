package com.amde.linecredit.domain.repository;

import com.amde.linecredit.domain.model.Customer;

public interface CustomerRepository extends GenericRepository<Customer> {

	Customer findById(long id);
	Customer findByNumber(String number);
}
