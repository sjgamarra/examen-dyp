package com.amde.linecredit.application.dto;

public class CustomerDto {
	private long id;
	private String number;
	private String firstName;
	private String lastName;
	private LineCreditDto lineCredit;

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

	public LineCreditDto getLineCredit() {
		return lineCredit;
	}

	public void setLineCredit(LineCreditDto lineCredit) {
		this.lineCredit = lineCredit;
	}

}
