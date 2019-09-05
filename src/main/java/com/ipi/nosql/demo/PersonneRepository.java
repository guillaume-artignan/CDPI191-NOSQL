package com.ipi.nosql.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonneRepository
        extends MongoRepository<Personne,String> {

}
