package com.nus.iss.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer_course")
public class LecturerCourse {
	
	
	private int lect_id_pk;
	
	@OneToOne
	@JoinColumn(name="course_id_pk")
	private Course course;
	
	public LecturerCourse() {
		
	}
	
	
	public LecturerCourse(int lect_id_pk, Course course) {
		super();
		this.lect_id_pk = lect_id_pk;
		this.course = course;
	}


	public int getLect_id_pk() {
		return lect_id_pk;
	}


	public void setLect_id_pk(int lect_id_pk) {
		this.lect_id_pk = lect_id_pk;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "LecturerCourse [lect_id_pk=" + lect_id_pk + ", course=" + course + "]";
	}
	
	
	

}
