package com.gwynejustin.unit_test.exception;


import java.time.LocalDateTime;

public record ExceptionObject(int errCode, String errorMessage, LocalDateTime timestamp) {}
