package com.example.dk_salon_backend.repository;
import com.example.dk_salon_backend.modals.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
