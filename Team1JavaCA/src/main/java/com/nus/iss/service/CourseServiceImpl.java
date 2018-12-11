package com.nus.iss.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nus.iss.respository.CourseRepository;
import com.nus.iss.respository.LecturerRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Resource
	private CourseRepository courseRepository;

}
