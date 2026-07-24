package com.example.dk_salon_backend.service;
import com.example.dk_salon_backend.models.Contact;
import java.util.List;

public interface ContactService {
    // Get Single Contact
    public Contact getContactById(Long id);

    // Get All Contacts
    public List<Contact> getContacts();

    // Create Contact
    public Contact createContact (Contact contact);

    // Delete Contact
    public void deleteContact (Long id);
}
