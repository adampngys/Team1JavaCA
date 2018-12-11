package com.nus.iss.respository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nus.iss.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer>{

//	@Query("SELECT DISTINCT e2.name FROM User u, Employee e1, Employee e2 WHERE u.employeeId = e1.employeeId AND e1.managerId = e2.employeeId AND u.userId=:uid")
//	ArrayList<String> findManagerNameByUID(@Param("uid") String uid);
	
	
	@Query("Select lc.course.name From Lecturer l, LecturerCourse lc where l.lect_id_pk = lc.lect_id_pk AND lc.lect_id_pk = :lid")
	ArrayList<String> findLecturerCourseByLID(@Param("lid") int lid);
	
	
	
}
