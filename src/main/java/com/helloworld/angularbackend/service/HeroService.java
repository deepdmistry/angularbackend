package com.helloworld.angularbackend.service;

import com.helloworld.angularbackend.model.Hero;

import java.util.List;

/**
 * @author deepmistry on 1/14/18.
 */
public interface HeroService {

    List<Hero> getHeroes();

    Hero getByName(String name);
}
