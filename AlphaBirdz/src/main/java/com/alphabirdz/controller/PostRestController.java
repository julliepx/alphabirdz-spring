package com.alphabirdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alphabirdz.model.Post;
import com.alphabirdz.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostRestController {
    
    @Autowired
    private PostRepository postRepository;

    @RequestMapping( value = "/id/{postId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> getId(final @PathVariable long postId){
        final Post id = postRepository.findById(postId);
        if(id == null){
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Post>(id, HttpStatus.OK);
	}
}
