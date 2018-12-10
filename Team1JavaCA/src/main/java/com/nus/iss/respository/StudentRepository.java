package com.nus.iss.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nus.iss.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
