package com.ipi.nosql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Personne> get(){
        return repo.findAll();
    }
}
