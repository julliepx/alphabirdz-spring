package com.alphabirdz.controller;

//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.logging.Logger;

import com.alphabirdz.model.Bird;

@RestController
public class BirdRestController {
    // private Logger logger = Logger.getLogger(BirdRestController.class.getCanonicalName());


    @GetMapping( "/bird")
    public Bird getBird(@RequestParam(value = "id") int id){
        List <Bird> birdList = new ArrayList<>();

        birdList.add(new Bird("Maguari Stork", "Ciconia maguari", "João-grande", "White", "Campo alagado e campo seco baixo", "Ciconnidae", "85 cm"));

        return birdList.get(id);
    }
}
