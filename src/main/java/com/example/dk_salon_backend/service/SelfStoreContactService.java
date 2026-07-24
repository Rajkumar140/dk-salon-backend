package com.example.dk_salon_backend.service;
import com.example.dk_salon_backend.models.Contact;
import com.example.dk_salon_backend.repository.ContactRepository;
import org.springframework.stereotype.Service;
import com.example.dk_salon_backend.exception.ContactNotFoundException;
import java.util.list;

@Service("selfStoreContactService")
public class SelfStoreContactService implements ContactService {

    private ContactRepository contactRepository;

    public SelfStoreContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // Get Single Contact
    @Override
    public Contact getProductById(Long id) {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new
                ContactNotFoundException("Contact number " + id + " is not found"));
        return contact;
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }


    // Create Contact
    @Override
    public Contact createContact (Contact contact) {
        return contactRepository.save(contact);
    }

    // Delete Contact
    @Override
    public void deleteContact (Long id) {
        contactRepository.deleteById(id);
    }
}