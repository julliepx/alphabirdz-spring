package com.alphabirdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

import com.alphabirdz.model.Bird;
import com.alphabirdz.repository.BirdRepository;

@RestController
@RequestMapping("/bird")
public class BirdRestController {

    private Logger info = Logger.getLogger(BirdRestController.class.getCanonicalName());

    @Autowired
    private BirdRepository birdRepository;

    @RequestMapping( value = "/id/{birdId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Bird> getBird(final @PathVariable long birdId){
        info.info(String.format("getBird: %s", birdId));
        final Bird bird = birdRepository.findById(birdId);
        if(bird == null){
            return new ResponseEntity<Bird>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Bird>(bird, HttpStatus.OK);
    }

    @RequestMapping( value = "/enname/{birdEnName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bird>> getBirdByEnName(final @PathVariable String birdEnName){
        info.info(String.format("getBirdByEnName: %s", birdEnName));

        List<Bird> bird = birdRepository.findByEnglishName(birdEnName);
        if(bird == null){
            return new ResponseEntity<List<Bird>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Bird>>(bird, HttpStatus.OK);
    }
}
