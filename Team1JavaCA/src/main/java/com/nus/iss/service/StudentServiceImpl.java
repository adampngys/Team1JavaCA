package com.nus.iss.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nus.iss.model.Student;
import com.nus.iss.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentRepository studentRepository;
	
	public String showAllStudents() {
			
		Iterable<Student> students = studentRepository.findAll();		

		String html = "";
		for (Student current : students) {
			html += current.getName() + "&nbsp" + current.getNick() + "<br>";
		}
		return html;
	}
}
