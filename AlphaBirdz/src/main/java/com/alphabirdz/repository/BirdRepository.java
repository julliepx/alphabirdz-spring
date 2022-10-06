package com.alphabirdz.repository;

import com.alphabirdz.model.Bird;
import org.springframework.dao.DataAccessException;

public interface BirdRepository {

    Bird findById(Long id) throws DataAccessException;

    Bird findAll();

    void save(Bird bird) throws DataAccessException;

}
