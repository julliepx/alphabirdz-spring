package com.alphabirdz.repository;

import org.springframework.data.repository.CrudRepository;

import com.alphabirdz.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {    

    Post findById(long id);
    
}