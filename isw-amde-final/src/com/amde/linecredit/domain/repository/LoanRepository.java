package com.amde.linecredit.domain.repository;

import java.util.Set;

import com.amde.linecredit.domain.model.Loan;

public interface LoanRepository extends GenericRepository<Loan> {

	Set<Loan> findLoansByCustomerNumber(String number);
}
