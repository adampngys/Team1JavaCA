package com.nus.iss.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nus.iss.model.LecturerCourse;
import com.nus.iss.respository.LecturerCourseRepository;
import com.nus.iss.respository.LecturerRepository;


@Service
public class LecturerCourseServiceImpl implements LecturerCourseService {
	
	@Resource
	private LecturerRepository lecturerRepository;
	@Resource
	private LecturerCourseRepository lecturerCourseRepository;

	@Override
	@Transactional
	public ArrayList<LecturerCourse> findAllCourses() {
		
		return lecturerCourseRepository.findAllCourses();
	}

}
