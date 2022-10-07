package com.alphabirdz.controller;

import java.util.logging.Logger;

import com.alphabirdz.repository.acessingdatajpa.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.logging.Logger;

import com.alphabirdz.model.Bird;

@RestController("/bird")
public class BirdRestController {

    private Logger info = Logger.getLogger(BirdRestController.class.getCanonicalName());

    @Autowired
    private BirdRepository birdRepository;

    @RequestMapping( value = "/{birdId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bird> getBird(@PathVariable("birdId") long birdId){
        info.info(String.format("getBird: %s", birdId));
        final Bird bird = birdRepository.findById(birdId);
        if(bird == null){
            return new ResponseEntity<Bird>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Bird>(bird, HttpStatus.OK);
    }
}
