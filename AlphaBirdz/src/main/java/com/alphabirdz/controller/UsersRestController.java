package com.alphabirdz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alphabirdz.model.Users;
import com.alphabirdz.repository.UsersRepository;

@RestController
public class UsersRestController {

    private Logger logger = LoggerFactory.getLogger(UsersRestController.class.getCanonicalName());

    @Autowired
	private UsersRepository usersRepository;

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> getId(final @PathVariable long userId) {
		logger.info(String.format("getAddress on: [%s]", userId));
		final Users user = usersRepository.findById(userId);
		if (user == null) {
			return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Users>(user, HttpStatus.OK);
    }
}