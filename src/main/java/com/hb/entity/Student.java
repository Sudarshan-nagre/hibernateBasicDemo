package com.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "roll_no")
	private int rollNo;
	
	@Column(name = "stud_name")
	private String name;
	
	@Column(name = "stud_add")
	private String add;
	
	@Column(name = "stud_mobile")
	private String mobile;
	
	@Column(name = "stud_email")
	private String email;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
