package com.example.dk_salon_backend.service;
import com.example.dk_salon_backend.modals.Contact;
import com.example.dk_salon_backend.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service("selfStoreContactService")
public class SelfStoreContactService implements ContactService {

    private ContactRepository contactRepository;

    public SelfStoreContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
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