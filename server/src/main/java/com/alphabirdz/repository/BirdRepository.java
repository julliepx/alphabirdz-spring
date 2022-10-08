package com.alphabirdz.repository;

import com.alphabirdz.model.Bird;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    Bird findByEnglishName(String englishName);

    Bird findById(long id);

}
