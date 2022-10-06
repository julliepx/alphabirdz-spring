package com.alphabirdz;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class Bird {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String englishName;
    private String latimName;
    private String portugueseName;
    private String dominantColor;
    private String gender;
    private String habitat;
    private String family;
    private String birdSize;



    public Bird(Long id, String englishName, String latimName, String portugueseName, String dominantColor, String habitat, String family, String birdSize) {
        this.id = id;
        this.englishName = englishName;
        this.latimName = latimName;
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

    public String getEnglishName() {
        return englishName;
    }

    public String getLatimName() {
        return latimName;
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
}
