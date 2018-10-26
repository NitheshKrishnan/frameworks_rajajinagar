package org.jspiders.hibernatecrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernatecrud.dto.StudentDTO;
import org.jspiders.singletonsfpackage.SingletonFactory;

public class StudentDAO
{
	public void insert(StudentDTO dto)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
	
	public void read(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
	
		StudentDTO dto = session.get(StudentDTO.class, id);
		
		System.out.println(dto);
		
		session.close();
		
		factory.close();
	}
	
	public void update(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
	
		StudentDTO dto = session.get(StudentDTO.class, id);
		
		if(dto!= null)
		{
			dto.setMarks(99.9);
			
			Transaction tx = session.beginTransaction();
			
			session.update(dto);
			
			tx.commit();
		}
		else
		{
			System.out.println("Record Not Found for Updation");
		}
		session.close();
		
		factory.close();
	}
	
	public void delete(int id)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		StudentDTO dto = session.get(StudentDTO.class, id);
		
		if(dto!= null)
		{
			System.out.println("Student Object successfully Deleted");
			session.delete(dto);
			
			tx.commit();
		}
		else
		{
			System.out.println("Record Not Present");
		}
		session.close();
		factory.close();
	}
}
