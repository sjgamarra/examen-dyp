package com.amde.linecredit.domain.exceptions;

public class CantBeLoanException extends Exception {
    public CantBeLoanException() {
        super("No se puede generar mas deudas...");
    }
}
