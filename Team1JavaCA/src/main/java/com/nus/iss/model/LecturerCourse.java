package com.nus.iss.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer_course")
public class LecturerCourse {
	
	
	private int lect_id_pk;
	private String course_id_pk;
	public LecturerCourse() {
		
	}
	
	
	public LecturerCourse(int lect_id_pk, String course_id_pk) {
		super();
		this.lect_id_pk = lect_id_pk;
		this.course_id_pk = course_id_pk;
	}


	public int getLect_id_pk() {
		return lect_id_pk;
	}


	public void setLect_id_pk(int lect_id_pk) {
		this.lect_id_pk = lect_id_pk;
	}


	public String getCourse_id_pk() {
		return course_id_pk;
	}


	public void setCourse_id_pk(String course_id_pk) {
		this.course_id_pk = course_id_pk;
	}
	
	
	

}
