package com.helloworld.angularbackend.repository;

import com.helloworld.angularbackend.model.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author deepmistry on 1/14/18.
 */

@Repository
public interface HeroRepository extends MongoRepository<Hero, String> {

    @Override
    List<Hero> findAll();

    @Query("{name:'?0'}")
    Hero findByName(String name);

    Hero findById(String id);
}
