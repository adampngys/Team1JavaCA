package com.nus.iss.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nus.iss.model.Course;
import com.nus.iss.model.Lecturer;
import com.nus.iss.model.LecturerCourse;
import com.nus.iss.service.CourseService;
import com.nus.iss.service.LecturerCourseService;
import com.nus.iss.service.LecturerService;





@Controller
@RequestMapping(value = "/lecturer")
public class LecturerController {
	
	@Autowired
	private CourseService cService;
	
	@Autowired
	private LecturerService lService;

	@Autowired
	private LecturerCourseService lCService;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		//binder.setValidator(studentValidator);
	}
	
//	@RequestMapping(value = "/course/display/{lect_id_pk}", method = RequestMethod.GET)
//	public ModelAndView listLecturerCoursespage(@PathVariable int lect_id_pk) {
//		ModelAndView mav = new ModelAndView("lecturercourses");
//		ArrayList<String> lecturercourse = lService.findLecturerCourseByLID(lect_id_pk);
//		mav.addObject("lecturercourse", lecturercourse);
//		return mav;
//	}

	
	@RequestMapping(value = "/course/display/", method = RequestMethod.GET)
	public ModelAndView listLecturerCoursespage() {
		ModelAndView mav = new ModelAndView("lecturercourses");
		ArrayList<Course> course = cService.allCoursesByLecturer();
		mav.addObject("course", course);
		return mav;
	}


}
