package com.example.dk_salon_backend.service;
import com.example.dk_salon_backend.modals.Contact;

public interface ContactService {
    // Create Contact
    public Contact createContact (Contact contact);

    // Delete Contact
    public void deleteContact (Long id);
}
