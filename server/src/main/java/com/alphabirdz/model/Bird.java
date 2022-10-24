package com.alphabirdz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "birds")
public class Bird {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String image;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "latin_name")
    private String latinName;

    @Column(name = "portuguese_name")
    private String portugueseName;

    @Column(name = "dominant_color")
    private String dominantColor;

    private String gender;
    private String habitat;
    private String family;

    @Column(name = "bird_size")
    private String birdSize;

    public Bird(String englishName, String latinName, String portugueseName, String dominantColor, String habitat, String family, String birdSize) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.portugueseName = portugueseName;
        this.dominantColor = dominantColor;
        this.habitat = habitat;
        this.family = family;
        this.birdSize = birdSize;
    }

    protected Bird(){
    }

    public Long getId() {
        return this.id;
    }

    public String getImage() {
        return image;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getlatinName() {
        return latinName;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getDominantColor() {
        return dominantColor;
    }

    public String getGender() {
        return gender;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getFamily() {
        return family;
    }

    public String getBirdSize() {
        return birdSize;
    }

    @Override
    public String toString(){
        return String.format("Bird [id = %d, English name = %s]", this.id, this.englishName);
    }
}
