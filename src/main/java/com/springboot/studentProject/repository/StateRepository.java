package com.springboot.studentProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.studentProject.model.State;

@Repository
public interface StateRepository extends MongoRepository<State, String>{

}
