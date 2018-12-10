package com.nus.iss.respository;

import org.springframework.data.repository.CrudRepository;

import com.nus.iss.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
