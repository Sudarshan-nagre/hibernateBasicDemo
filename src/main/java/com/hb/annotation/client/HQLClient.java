package com.hb.annotation.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class HQLClient {

	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();
		
		//String hql = "from Student";
		String hql = "from Student where rollNo IN (1,12)";
		Query query = session.createQuery(hql);
		List<Student> list =  query.list();
		
		list.stream().forEach(st->System.out.println
				("RollNo : "+st.getRollNo()+"\nName : "+st.getName()));
		
		session.close();
	}
}
