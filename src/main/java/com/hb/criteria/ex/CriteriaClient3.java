package com.hb.criteria.ex;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class CriteriaClient3 {

	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();

		Criteria ct = session.createCriteria(Student.class);
		
		Projection pj = Projections.avg("rollNo");
		
		ct.setProjection(pj);
		
		List l = ct.list();
		System.out.println("Max RollNo : "+l.get(0));
		session.close();
	}
}
