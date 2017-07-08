package com.amde.linecredit.domain.services;

import java.math.BigDecimal;

import com.amde.linecredit.domain.exceptions.CantBeLoanException;
import com.amde.linecredit.domain.model.Customer;
import com.amde.linecredit.domain.model.Loan;

public class LineCalculationDomainService {

	public BigDecimal performLineCreditCalculation(Customer customer) throws Exception{
		BigDecimal baseLineCredit = BigDecimal.ZERO;	
		if(customer.canBeLoan()){
			baseLineCredit = BigDecimal.valueOf(10000);
			//TODO; yada yada el codigo que hace la validacion entre las deudas del customer y genera una linea base de credito.
		}else{
			throw new CantBeLoanException();
		}
		
		return baseLineCredit;
	}
	
}
