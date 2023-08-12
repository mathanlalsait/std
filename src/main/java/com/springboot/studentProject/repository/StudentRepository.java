package com.springboot.studentProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.studentProject.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{

}
