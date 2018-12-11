package com.nus.iss.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nus.iss.respository.LecturerCourseRepository;
import com.nus.iss.respository.LecturerRepository;


@Service
public class LecturerServiceImpl implements LecturerService {

	@Resource
	private LecturerRepository lecturerRepository;
	@Resource
	private LecturerCourseRepository lecturerCourseRepository;
	
	
	
	@Override
	@Transactional
	public ArrayList<String> findLecturerCourseByLID( int lid) {
		return lecturerRepository.findLecturerCourseByLID(lid);
	}
	
	
	
	
	
	
	
}
