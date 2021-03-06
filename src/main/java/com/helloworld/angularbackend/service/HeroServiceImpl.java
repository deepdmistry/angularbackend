package com.helloworld.angularbackend.service;

import com.helloworld.angularbackend.model.Hero;
import com.helloworld.angularbackend.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Hero> getAllByTerm(String term) {
        return heroRepository.getAllByTerm(term);
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
    public Hero add(Hero hero) {
        return heroRepository.insert(hero);
    }

    @Override
    public Hero update(Hero hero) {
        return heroRepository.save(hero);
    }
}