package com.example.dk_salon_backend.service;
import com.example.dk_salon_backend.models.Contact;

public interface ContactService {
    // Get Single Contact
    public Contact getContactById(Long id);

    // Get All Contacts
    public Contact getContacts();

    // Create Contact
    public Contact createContact (Contact contact);

    // Delete Contact
    public void deleteContact (Long id);
}
