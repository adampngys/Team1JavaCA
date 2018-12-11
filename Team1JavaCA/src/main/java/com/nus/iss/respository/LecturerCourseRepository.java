package com.nus.iss.respository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nus.iss.model.Course;
import com.nus.iss.model.Lecturer;
import com.nus.iss.model.LecturerCourse;





public interface LecturerCourseRepository extends JpaRepository<LecturerCourse, Integer> {

	
	
	
	@Query("SELECT c from Course c, LecturerCourse lc WHERE c.course_id_pk = lc.course_id_pk")
	ArrayList<Course> allCoursesByLecturer();
	
	@Query( "SELECT * FROM lecturer_course lc")
	ArrayList<LecturerCourse> findAllCourses();
}
