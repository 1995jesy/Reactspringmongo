package com.example.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springboot.model.Student;

public interface  StudentRepository extends MongoRepository<Student,String>{

}
