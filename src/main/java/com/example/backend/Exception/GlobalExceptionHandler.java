package com.example.backend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> customNotFoundException(ResourceNotFoundException exception) {
        String message = "Resource not found";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

    @ExceptionHandler(ResourceNotPersistedException.class)
    public ResponseEntity<String> customNotPersistedException(ResourceNotPersistedException exception) {
        String errorMessage = "Resource not saved";
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }
}

