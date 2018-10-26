package org.jspiders.onetomanymapping.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.onetomanymapping.dto.SubjectDTO;
import org.jspiders.onetomanymapping.dto.TrainerDetailsDTO;
import org.jspiders.singletonsfpackage.SingletonFactory;

public class InsertOneToManyUtil
{
	public static void main(String[] args)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		TrainerDetailsDTO trainer = session.get(TrainerDetailsDTO.class, 1);
	
		SubjectDTO subject1 = new SubjectDTO("Java");
		SubjectDTO subject2 = new SubjectDTO("J2ee");
		SubjectDTO subject3 = new SubjectDTO("Framework");
		
		trainer.addSubjects(subject1);
		trainer.addSubjects(subject2);
		trainer.addSubjects(subject3);
	
		session.save(trainer);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
}
