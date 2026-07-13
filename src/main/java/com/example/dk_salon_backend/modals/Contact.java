package com.example.dk_salon_backend.modals;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Contact extends BaseModel {
    private String name;
    private String email;
    private String phone;
    @Column(length = 2000)
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
