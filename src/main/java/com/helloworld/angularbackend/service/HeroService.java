package com.helloworld.angularbackend.service;

import com.helloworld.angularbackend.model.Hero;

import java.util.List;

/**
 * @author deepmistry on 1/14/18.
 */
public interface HeroService {

    List<Hero> getHeroes();

    List<Hero> getAllByTerm(String term);

    Hero getById(String id);

    void deleteById(String id);

    Hero add(Hero hero);

    Hero update(Hero hero);
}
