package com.alphabirdz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.alphabirdz.model.Bird;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    List<Bird> findAll();
    Bird findByEnglishName(String englishName);
    Bird findById(long id);
}
