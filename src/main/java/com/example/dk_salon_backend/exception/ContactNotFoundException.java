package com.example.dk_salon_backend.exception;

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException (String message) {
        super(message);
    }
}
