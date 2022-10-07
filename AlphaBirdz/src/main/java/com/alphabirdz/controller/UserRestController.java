package com.alphabirdz.controller;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(UserRestController.class.getCanonicalName());

    @Autowired
	private UserRepository usersRepository;

    @RequestMapping(value = "/id/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getId(final @PathVariable long userId) {
		logger.info(String.format("getAddress on: [%s]", userId));
		final User id = usersRepository.findById(userId);
		if (id == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(id, HttpStatus.OK);
    }

	@RequestMapping(value = "/name/{username}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUsername(final @PathVariable String username) {
		logger.info(String.format("getAddress on: [%s]", username));
		final User name = usersRepository.findByUsername(username);
		if (name == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(name, HttpStatus.OK);
=======
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
>>>>>>> bd52b12aaa8d05f922e3d2030ceebda86ddd5cca
    }
}