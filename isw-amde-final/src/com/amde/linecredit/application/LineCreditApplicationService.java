package com.amde.linecredit.application;

import com.amde.linecredit.application.dto.CustomerDto;
import com.amde.linecredit.application.dto.LineCreditDto;
import com.amde.linecredit.domain.model.Customer;
import com.amde.linecredit.domain.repository.CustomerRepository;
import com.amde.linecredit.domain.repository.LoanRepository;
import com.amde.linecredit.domain.services.LineCalculationDomainService;

public class LineCreditApplicationService {

	private LoanRepository loanRepository;
	private CustomerRepository customerRepository;
	private LineCalculationDomainService lineCalculationDomainService;

	public LineCreditDto performLineCreditCalculation(CustomerDto targetCustomer) throws Exception {
		LineCreditDto lineCredit = new LineCreditDto();

		try {
			Customer customer = this.customerRepository.findByNumber(targetCustomer.getNumber());
			customer.setLoans(this.loanRepository.findLoansByCustomerNumber(targetCustomer.getNumber()));
			lineCredit.setValue(this.lineCalculationDomainService.performLineCreditCalculation(customer));
		} catch (Exception e) {
			lineCredit.setMessage(e.getMessage());
		}

		return lineCredit;
	}

}
