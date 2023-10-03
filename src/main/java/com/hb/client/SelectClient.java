package com.hb.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Employee;

public class SelectClient {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory(); 
		Session session = factory.openSession();
		
		Employee emp= session.load(Employee.class, 12);
		System.out.println("EmpName : "+emp.getEmpName()+"\nEmpId : "+emp.getEmpId());
		
		session.evict(emp);
		System.out.println("Object Contains in session : "+session.contains(emp));
		
		session.close();
		System.out.println("Save---------");
	
	}

}
