package com.alphabirdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alphabirdz.model.Bird;
import com.alphabirdz.repository.BirdRepository;

@RestController
@RequestMapping("/birds")
public class BirdRestController {

    @Autowired
    private BirdRepository birdRepository;

    @RequestMapping( value = "/id/{birdId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bird> getBird(final @PathVariable long birdId){
        final Bird bird = birdRepository.findById(birdId);
        if(bird == null){
            return new ResponseEntity<Bird>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Bird>(bird, HttpStatus.OK);
    }

    @RequestMapping( value = "/enname/{birdEnName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bird> getBirdByEnName(final @PathVariable String birdEnName){
        Bird bird = birdRepository.findByEnglishName(birdEnName);
        if(bird == null){
            return new ResponseEntity<Bird>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Bird>(bird, HttpStatus.OK);
    }

    @RequestMapping( value = "/ison", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String isResponding(){
        return "Server is responding to request!";
    }
}
