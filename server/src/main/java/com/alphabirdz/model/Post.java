/*
 * Copyright (c) 2022, Alphabirdz. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package com.alphabirdz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The {@code Post} represents a Post and stores its attributes.
 * <p>
 * The class also includes a marker annotation that indicates
 * that the annotated class is a {@code Entity} declaring that
 * the class is a JPA entity.
 *
 * @author Ariel Quaresma
 * @author Jullie Paixão
 * @author Kalebe Nascimento
 * @see com.alphabirdz.PostRepository
 */

@Entity
@Schema
@Table(name = "posts")
public class Post {

    /**
     * Atributes of the Post.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String image;
    private String location;
    private String date;

    @Column(name = "fk_user")
    private int user;

    @Column(name = "fk_bird")
    private int bird;

    /**
     * Constructs a new {@code Post} with the specified attributes.
     * @param image
     * @param location
     * @param date
     * @param user
     * @param bird
     */
    public Post(String image, String location, String date, int user, int bird) {
        this.image = image;
        this.location = location;
        this.date = date;
        this.user = user;
        this.bird = bird;
    }

    /**
     * Empty constructor.
     */
    protected Post() {

    }

    /**
     * Getters.
     */
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