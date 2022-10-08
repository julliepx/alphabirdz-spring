package com.alphabirdz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alphabirdz.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {    

    Post findById(long id);
    
}