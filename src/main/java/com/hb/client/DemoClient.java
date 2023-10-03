package com.hb.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Employee;

public class DemoClient {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(12);
		emp.setEmpName("Sudarshan");
		emp.setEmpDept("network");
		emp.setEmpAdd("Pune");
		
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("Save---------");
	}
}
