package com.nus.iss.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nus.iss.model.Course;
import com.nus.iss.model.Lecturer;

public interface CourseRepository extends JpaRepository<Course, String> {

}
