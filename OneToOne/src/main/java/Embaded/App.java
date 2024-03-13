package Embaded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration(); 
		 cfg.configure("Hibernate.cfg.xml");
		   SessionFactory factory=cfg.buildSessionFactory();
		  
		   
		   Session session = factory.openSession(); 
		   Transaction t = session.beginTransaction();  
		   
		   Student s=new Student();
	    	  s.setId(1);
	    	  s.setName("Abhay");
	    	  s.setRollno(101);
	    	  School s1=new School();
	    	  s1.setSchoolname("Railworld");
	    	  s1.setSchooladdress("raipur");
		   

		  
		  
	    	  s.setSchool(s1);
	    	  
	    	  session.save(s);
	    	  
		   t.commit();
		   session.close();
		   factory.close();
		   System.out.println("saved the data");
    }
}
