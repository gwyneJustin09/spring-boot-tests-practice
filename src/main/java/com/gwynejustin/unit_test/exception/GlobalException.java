package com.gwynejustin.unit_test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler
    public ResponseEntity<ExceptionObject> handleBookNotFoundException(BookNotFoundException ex) {
       return new ResponseEntity<>(
               new ExceptionObject(
                       HttpStatus.NOT_FOUND.value(),
                       ex.getMessage(),
                       LocalDateTime.now()
               ),
               HttpStatus.NOT_FOUND
       );
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionObject> handleCustomerNotFoundException(CustomerNotFoundException ex) {
        return new ResponseEntity<>(
                new ExceptionObject(
                        HttpStatus.NOT_FOUND.value(),
                        ex.getMessage(),
                        LocalDateTime.now()
                ),
                HttpStatus.NOT_FOUND
        );
    }
}
