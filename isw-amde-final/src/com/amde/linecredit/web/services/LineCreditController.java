package com.amde.linecredit.web.services;

import com.amde.linecredit.application.LineCreditApplicationService;
import com.amde.linecredit.application.dto.CustomerDto;
import com.amde.linecredit.application.dto.LineCreditDto;

public class LineCreditController {

	private LineCreditApplicationService lineCreditApplicationService;

	public LineCreditDto performLineCreditCalculation(String targetCustomerNumber) throws Exception {
		CustomerDto targetCustomer = new CustomerDto();
		targetCustomer.setNumber(targetCustomerNumber);
		LineCreditDto lineCredit = lineCreditApplicationService.performLineCreditCalculation(targetCustomer);
		return lineCredit;
	}
}
