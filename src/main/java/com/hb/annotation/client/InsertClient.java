package com.hb.annotation.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class InsertClient {
	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setName("Sudarshan");
		st.setAdd("Pune");
		st.setMobile("9988909878");
		st.setEmail("sudarshan.n@gmail.com");
		
		session.save(st);
		tx.commit();
		session.close();
		System.out.println("Student inserted success...");
	}
}
