package com.ipi.nosql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    PersonneRepository repo;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public void insert(@RequestBody Personne p){
        repo.insert(p);

    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Personne> get(@RequestParam(value = "nom", required = false) String nom){
        if (nom==null){
            return repo.findAll();
        }

        return repo.findAllName(nom);

    }
}
