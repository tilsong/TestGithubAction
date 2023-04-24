package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private String password;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
