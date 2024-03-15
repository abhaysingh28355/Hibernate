package com.maping.Maping;

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
		

		

		// creating object question

		question q1 = new question();
		q1.setQuestionid(1212);
		q1.setQuestion("What is java?");
		
		

		// creating object Answer

		Answer a1 = new Answer();

		a1.setAnswerid(343);
		a1.setAnswer("Java is Programming Language");

		q1.setAnswer(a1);
		
		
		
		// Session

		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();

		s.save(q1);
		s.save(a1);

		tx.commit();

		factory.close();
	}
}
