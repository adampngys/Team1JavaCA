package com.nus.iss.respository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nus.iss.model.Lecturer;
import com.nus.iss.model.LecturerCourse;



public interface LecturerCourseRepository extends JpaRepository<Lecturer, Integer> {

	
	@Query( "SELECT * FROM lecturer_course lc")
	ArrayList<LecturerCourse> findAllCourses();
}
