package com.nus.iss.respository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nus.iss.model.Course;
import com.nus.iss.model.Lecturer;

public interface CourseRepository extends JpaRepository<Course, String> {

	
	
	@Query("SELECT c from Course c, LecturerCourse lc WHERE c.course_id_pk = lc.course_id_pk")
	ArrayList<Course> allCoursesByLecturer();
}
