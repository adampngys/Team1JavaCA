package com.nus.iss.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "lecturer")
public class Lecturer {
	
	
	 @Id
	 private int lect_id_pk;
	 private String name;
	 private String faculty;
	 private String phone;
	 @Temporal(TemporalType.DATE)
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date dob;
	 private String email;
	 private String user_id_fk;

	 
	 public Lecturer() {
		 
	 }


	public Lecturer(int lect_id_pk, String name, String faculty, String phone, Date dob, String email,
			String user_id_fk) {
		super();
		this.lect_id_pk = lect_id_pk;
		this.name = name;
		this.faculty = faculty;
		this.phone = phone;
		this.dob = dob;
		this.email = email;
		this.user_id_fk = user_id_fk;
	}


	public int getLect_id_pk() {
		return lect_id_pk;
	}


	public void setLect_id_pk(int lect_id_pk) {
		this.lect_id_pk = lect_id_pk;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUser_id_fk() {
		return user_id_fk;
	}


	public void setUser_id_fk(String user_id_fk) {
		this.user_id_fk = user_id_fk;
	}


	@Override
	public String toString() {
		return "Lecturer [lect_id_pk=" + lect_id_pk + ", name=" + name + ", faculty=" + faculty + ", phone=" + phone
				+ ", dob=" + dob + ", email=" + email + ", user_id_fk=" + user_id_fk + "]";
	}
	 
	 
	 
	 
	 
	 

}
