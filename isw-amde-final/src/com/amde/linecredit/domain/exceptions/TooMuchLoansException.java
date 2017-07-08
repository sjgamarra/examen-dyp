package com.amde.linecredit.domain.exceptions;

public class TooMuchLoansException extends Exception {
    public TooMuchLoansException() {
        super("El cliente presenta demasiadas deudas...");
    }
}