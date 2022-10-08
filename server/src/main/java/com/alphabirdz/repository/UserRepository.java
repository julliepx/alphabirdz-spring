package com.alphabirdz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alphabirdz.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {    
    User findByUsername(String username);

    User findByEmail(String email);

    User findById(long id);

    List<User> findAllById(long ids);
}
