package com.alphabirdz.controller;

//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.logging.Logger;

import com.alphabirdz.model.User;

@RestController
public class UserRestController {
    // private Logger logger = Logger.getLogger(BirdRestController.class.getCanonicalName());


    @GetMapping( "/user/{id}")
    public User getBird(@PathVariable int id){
        List <User> userList = new ArrayList<>();

        userList.add(new User(1L, "img url", "TheBestFotografo", "Bento de Melo", "hashPassword"));

        return userList.get(id - 1);
    }
}