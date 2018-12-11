package com.nus.iss.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nus.iss.model.Course;
import com.nus.iss.respository.CourseRepository;
import com.nus.iss.respository.LecturerRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Resource
	private CourseRepository courseRepository;

	@Override
	@Transactional
	public ArrayList<Course> allCoursesByLecturer() {
		// TODO Auto-generated method stub
		return courseRepository.allCoursesByLecturer();
	}
	
	
	

}
