package com.alphabirdz.repository.acessingdatajpa;

import com.alphabirdz.model.Bird;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface BirdRepository extends CrudRepository<Bird, Long> {

    List<Bird> findByEnglishName(String englishName);

    Bird findById(long id);

}
