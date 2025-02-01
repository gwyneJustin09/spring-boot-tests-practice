package com.gwynejustin.unit_test.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
