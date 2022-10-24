package com.alphabirdz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.alphabirdz.model.Post;
import com.alphabirdz.repository.PostRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/posts")
public class PostRestController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> getAllPosts(){
        final List<Post> post = postRepository.findAll();
        if(post.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @RequestMapping( value = "/id/{postId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> getPostById(final @PathVariable long postId){
        final Post id = postRepository.findById(postId);
        if(id == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
