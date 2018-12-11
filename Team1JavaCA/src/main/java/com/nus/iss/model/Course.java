package com.nus.iss.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "course")
public class Course {

	private String course_id_pk;
	private String name;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startdate;
	private int duration;
	private int size;
	private int credit;
	public Course() {
		
	}
	public Course(String course_id_pk, String name, Date startdate, int duration, int size, int credit) {
		super();
		this.course_id_pk = course_id_pk;
		this.name = name;
		this.startdate = startdate;
		this.duration = duration;
		this.size = size;
		this.credit = credit;
	}
	public String getCourse_id_pk() {
		return course_id_pk;
	}
	public void setCourse_id_pk(String course_id_pk) {
		this.course_id_pk = course_id_pk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Course [course_id_pk=" + course_id_pk + ", name=" + name + ", startdate=" + startdate + ", duration="
				+ duration + ", size=" + size + ", credit=" + credit + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
