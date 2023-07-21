package com.example.backend.Exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String exceptionMessage) {
        super(exceptionMessage);}

}
