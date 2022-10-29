package com.alphabirdz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alphabirdz.model.User;
import com.alphabirdz.repository.UserRepository;

import ch.qos.logback.core.status.Status;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/id/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getId(final @PathVariable long userId) {
        final User id = userRepository.findById(userId);
        if (id == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(id, HttpStatus.OK);
    }

    @RequestMapping(value = "/name/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUsername(final @PathVariable String username) {
        final User name = userRepository.findByUsername(username);
        if (name == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(name, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        User userFound;

        try {
            userFound = userRepository.findByEmail(user.getEmail());
        }
        catch (Exception e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }

        if (userFound == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }else{
            if (userFound.getPassword().equals(user.getPassword())){
                user.setLoggedIn(true);
                return new ResponseEntity<User>(userFound, HttpStatus.OK);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }
}