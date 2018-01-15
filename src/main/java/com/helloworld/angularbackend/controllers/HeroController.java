package com.helloworld.angularbackend.controllers;

import com.helloworld.angularbackend.model.Hero;
import com.helloworld.angularbackend.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author deepmistry on 1/13/18.
 */
@RestController
@CrossOrigin
@RequestMapping("/heroes")
public class HeroController {

    private final HeroService heroService;
    private static final Logger logger = Logger.getLogger(HeroController.class.getName());

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @RequestMapping("/getHeroes")
    @ResponseBody
    public List<Hero> getHeroes() {
        return heroService.getHeroes();
    }

    @RequestMapping("/get/{name}")
    @ResponseBody
    public Hero getByName(@PathVariable String name) {
        return heroService.getByName(name);
    }
}