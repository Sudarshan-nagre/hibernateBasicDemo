package com.hb.conn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LocalConfiguration {

	static public Session getLocalSession() {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();
		return factory.openSession();
	}
	
	static public Session getLocalSessionAnnotation() {
		Configuration conf = new Configuration();
		conf.configure("hibernate-annotation.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();
		return factory.openSession();
	}
}
