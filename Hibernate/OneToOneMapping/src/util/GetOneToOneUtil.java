package org.jspiders.onetoonemapping.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.onetoonemapping.dto.TrainerDetailsDTO;
import org.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import org.jspiders.singletonsfpackage.SingletonFactory;

public class GetOneToOneUtil
{
	public static void main(String[] args)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		TrainerDetailsDTO trainer = session.get(TrainerDetailsDTO.class, 1);
		
		System.out.println("Trainer Professional Details --> "+trainer);
		
		System.out.println("Trainer Personal Details --> "+trainer.getPersonal());
		
		session.close();
		
		factory.close();
	}
}
