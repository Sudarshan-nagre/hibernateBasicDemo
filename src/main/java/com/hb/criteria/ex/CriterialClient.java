package com.hb.criteria.ex;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class CriterialClient {
	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();
		
		Criteria ct = session.createCriteria(Student.class);
		List<Student> st = ct.list();
		st.stream().forEach(stud -> System.out.println
		("RollNo : "+stud.getRollNo()+"\nName : "+stud.getName()+"\nAddress : "+stud.getAdd()));
		
		session.close();
	}
}
