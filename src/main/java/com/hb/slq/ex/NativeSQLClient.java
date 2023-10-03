package com.hb.slq.ex;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class NativeSQLClient {

	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();
		
		String sqlQuery = "select * from stud_table";

		NativeQuery query = session.createSQLQuery(sqlQuery);
		query.addEntity(Student.class);
		
		List<Student> list = query.list();
		list.stream().forEach
		(st ->System.out.println("RollNO : "+st.getRollNo()+"\nName : "+st.getName()));
		
		session.close();
	}

}
