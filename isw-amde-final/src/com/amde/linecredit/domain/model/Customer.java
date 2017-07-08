package com.amde.linecredit.domain.model;

import java.util.Set;

import com.amde.linecredit.domain.exceptions.TooMuchLoansException;

public class Customer {
	private long id;
	private String number;
	private String firstName;
	private String lastName;
	private Set<Loan> loans;

	public boolean canBeLoan() {
		return loans.size() < 5; //esto es didactico.
	}

	public void addLoan(Loan loan) throws TooMuchLoansException {
		if (canBeLoan())
			loans.add(loan);
		else
			throw new TooMuchLoansException();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

}
