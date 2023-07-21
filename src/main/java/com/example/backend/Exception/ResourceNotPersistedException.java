package com.example.backend.Exception;

public class ResourceNotPersistedException extends RuntimeException {

    public ResourceNotPersistedException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
