package com.example.dk_salon_backend.controller;
import com.example.dk_salon_backend.modals.Contact;
import com.example.dk_salon_backend.service.ContactService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private ContactService contactService;

    public ContactController(@Qualifier("selfStoreContactService") ContactService contactService) {
        this.contactService = contactService;
    }

    // Basic Api
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Contact Information is running!";
    }

    // Create Contact
    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact createdContact = contactService.createContact(contact);
        return ResponseEntity.status(201).body(createdContact);
    }

    // Delete Contact
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable("id") Long id) {
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}