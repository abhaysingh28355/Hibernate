package com.OneToMany;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
        //Creating Question
        Question q1 = new Question();
        
        q1.setQuestionid(1212);
        q1.setQuestion("What is java?");
        
        
        //Creating Answer
        
        Answer ans = new Answer();
        ans.setAnswerid(343);
        ans.setAnswer("Java is programming Language");
        
        ans.setQuestion(q1);
        
        
        Answer ans1 = new Answer();
        ans1.setAnswerid(43);
        ans1.setAnswer("With the help of creating a software");
        
        ans1.setQuestion(q1);
        
        Answer ans2 = new Answer();
        ans2.setAnswerid(33);
        ans2.setAnswer("Java has different Type of Frameworks");
        
        ans2.setQuestion(q1);
        
        ArrayList<Answer> li = new ArrayList<Answer>();
        
        li.add(ans);
        li.add(ans1);
        li.add(ans2);
        
        
        q1.setAnswer(li);
        
        
        
    	Session s = factory.openSession();

		Transaction tx = s.beginTransaction();

		s.save(q1);
		s.save(ans);
		s.save(ans1);
		s.save(ans2);

		tx.commit();

		factory.close();
    }
}
