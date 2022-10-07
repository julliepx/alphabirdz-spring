package com.alphabirdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alphabirdz.model.User;
import com.alphabirdz.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
    private UserRepository userRepository;

    @RequestMapping( value = "/id/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getId(final @PathVariable long userId){
        final User id = userRepository.findById(userId);
        if(id == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(id, HttpStatus.OK);
	}

	@RequestMapping( value = "/name/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUsername(final @PathVariable String username){
        final User name = userRepository.findByUsername(username);
        if(name == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(name, HttpStatus.OK);
	}
}