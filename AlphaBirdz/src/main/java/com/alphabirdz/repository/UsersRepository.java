package com.alphabirdz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alphabirdz.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {    
    Users findByUsername(String username);

    Users findByEmail(String email);

    Users findById(long id);

    List<Users> findAllById(long ids);
}
