package com.alphabirdz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.alphabirdz.model.Bird;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    Bird findByEnglishName(String englishName);
    Bird findById(long id);
    List<Bird> findAll();
}
