package com.hb.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Employee;

public class UpdateClient {

	public static void main(String[] args) {

		Session session = LocalConfiguration.getLocalSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e = session.load(Employee.class, 10);
		e.setEmpName("Shyam");
		e.setEmpAdd("Mumbai");
		
		session.update(e);
		
		tx.commit();
		session.close();
		System.out.println("Record Deleted Success ...");
	}
}
