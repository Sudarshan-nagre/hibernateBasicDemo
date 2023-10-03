package com.hb.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Employee;

public class DeleteClient {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		
		session.delete(emp);
		
		tx.commit();
		session.close();
		System.out.println("Record Deleted Success ...");
	}
}
