package com.example.Hibernatedemo;

import java.util.List;



import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class App 
{
    public static void main( String[] args )
    {
    	Agent a1= new Agent(101,"Mahesh","Gurugram",20000);
    	Agent a2= new Agent(102,"Sumit","Ahemdabad",25000);
    	Agent a3= new Agent(103,"Rajesh","Delhi",30000);
    	Agent a4= new Agent(104,"Amit","Faridabad",28000);
    	
    	Configuration con= new Configuration().configure().addAnnotatedClass(Agent.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction t=session.beginTransaction();
    	
    	session.save(a1);
    	session.save(a2);
    	session.save(a3);
    	session.save(a4);
    	
    	Query query = session.createQuery("from Alien");
    	
    	List<Agent> list= query.list();
    	for(Agent a:list)
    	{
    		System.out.println(a);
    	}
    	
    	
    	session.getTransaction().commit();
    	t.commit();
    	
    	session.close();
        System.out.println( "Hello World!" );
    }
}
