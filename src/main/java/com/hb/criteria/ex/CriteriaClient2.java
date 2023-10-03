package com.hb.criteria.ex;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hb.conn.LocalConfiguration;
import com.hb.entity.Student;

public class CriteriaClient2 {

	public static void main(String[] args) {
		Session session = LocalConfiguration.getLocalSessionAnnotation();

		Criteria ct = session.createCriteria(Student.class);
		
		Criterion ctn1 =Restrictions.eq("rollNo", 10);
		Criterion ctn2 =Restrictions.eq("name", "Sudarshan");
		
		//Criterion ctn3 = Restrictions.and(ctn1, ctn2);
		
		Criterion ctn3 = Restrictions.or(ctn1, ctn2);
		
		Criterion ctnLike =Restrictions.like("name", "%n");
		
		ct.add(ctnLike);
		
		List<Student> ll = ct.list();
		ll.stream().forEach
		(st ->System.out.println("RollNO : "+st.getRollNo()+"\nName : "+st.getName()));
		session.close();
	}
}
