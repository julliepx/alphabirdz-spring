package com.alphabirdz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String profilePhoto;
    private String username;
    private String email;
    private String password;

    public Users(String profilePhoto, String username, String email, String password) {
        this.profilePhoto = profilePhoto;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    protected Users() {

    }

    public Long getId() {
        return id;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, profilePhoto='%s', username='%s', email='%s', password='%s']",
                id, profilePhoto, username, email, password);
    }
}