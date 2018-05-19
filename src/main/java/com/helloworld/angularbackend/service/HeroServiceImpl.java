package com.helloworld.angularbackend.service;

import com.helloworld.angularbackend.model.Hero;
import com.helloworld.angularbackend.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * @author deepmistry on 1/14/18.
 */
@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    @Override
    public Hero getByName(String name) {
        return heroRepository.findByName(name);
    }

    @Override
    public Hero getById(String id) {
        return heroRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        heroRepository.delete(id);
    }

    @Override
    public Hero add(String name) {
        Hero hero = new Hero();
        hero.setName(name);
        return heroRepository.insert(hero);
    }
}