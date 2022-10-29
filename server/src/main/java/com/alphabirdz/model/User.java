package com.alphabirdz.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profile_photo")
    private String profilePhoto;

    private String username;
    private String email;
    private String password;
    private Boolean loggedIn;

    public User(String profilePhoto, String username, String email, String password) {
        this.profilePhoto = profilePhoto;
        this.username = username;
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    protected User() {

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

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, profilePhoto='%s', username='%s', email='%s', password='%s']",
                id, profilePhoto, username, email, password);
    }
}