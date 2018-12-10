package com.nus.iss.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nus.iss.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer>{

}
