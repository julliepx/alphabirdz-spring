package com.alphabirdz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String image;
    private String location;
    private String date;

    @Column(name = "fk_user")
    private int user;

    @Column(name = "fk_bird")
    private int bird;

    public Post(String image, String location, String date, int user, int bird) {
        this.image = image;
        this.location = location;
        this.date = date;
        this.user = user;
        this.bird = bird;
    }

    protected Post() {

    }

    public long getId() {
        return id;
    }
    public String getImage() {
        return image;
    }
    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    public int getUser() {
        return user;
    }
    public int getBird() {
        return bird;
    }
}
