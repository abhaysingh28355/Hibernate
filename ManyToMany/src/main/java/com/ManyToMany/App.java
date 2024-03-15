package com.ManyToMany;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(34);
		e1.setName("Abhay");
		
		e2.setEid(35);
		e2.setName("Aman");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(43);
		p1.setProjectName("Liberary Management System");
		
		p2.setPid(53);
		p2.setProjectName("ChatBot");
		
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p1.setEmps(list1);

   	 Session session = factory.openSession(); 
   	   Transaction t = session.beginTransaction(); 
   	   
   	   
   	   session.save(e1);
   	   session.save(e2);
   	   session.save(p1);
   	   session.save(p2);
   	   
   	t.commit();
   	   session.close();
   	   

	}
}
