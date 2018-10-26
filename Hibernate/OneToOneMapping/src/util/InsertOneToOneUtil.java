package org.jspiders.onetoonemapping.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.onetoonemapping.dto.TrainerDetailsDTO;
import org.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import org.jspiders.singletonsfpackage.SingletonFactory;

public class InsertOneToOneUtil
{
	public static void main(String[] args)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		TrainerPersonalDTO personal = new TrainerPersonalDTO("Hindi", "Mumbai", "Divorced");
		
		TrainerDetailsDTO trainer = new TrainerDetailsDTO("Abdul", "Jamaal", 25);
		
		trainer.setPersonal(personal);
		
		session.save(trainer);
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
}
