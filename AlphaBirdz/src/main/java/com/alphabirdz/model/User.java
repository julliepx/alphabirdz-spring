package com.alphabirdz.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ornithologist")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

=======
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class User {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> bd52b12aaa8d05f922e3d2030ceebda86ddd5cca
    private String profilePhoto;
    private String username;
    private String email;
    private String password;

<<<<<<< HEAD
    public User(String profilePhoto, String username, String email, String password) {
=======
    protected User() {}

    public User(Long id, String profilePhoto, String username, String email, String password) {
        this.id = id;
>>>>>>> bd52b12aaa8d05f922e3d2030ceebda86ddd5cca
        this.profilePhoto = profilePhoto;
        this.username = username;
        this.email = email;
        this.password = password;
    }

<<<<<<< HEAD
    protected User() {

    }

=======
>>>>>>> bd52b12aaa8d05f922e3d2030ceebda86ddd5cca
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
<<<<<<< HEAD

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, profilePhoto='%s', username='%s', email='%s', password='%s']",
                id, profilePhoto, username, email, password);
    }
=======
>>>>>>> bd52b12aaa8d05f922e3d2030ceebda86ddd5cca
}