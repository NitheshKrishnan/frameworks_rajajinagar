package org.jspiders.onetoonemapping.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.onetoonemapping.dto.TrainerDetailsDTO;
import org.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import org.jspiders.singletonsfpackage.SingletonFactory;

public class GetOneToOneBidirectionalUtil
{
	public static void main(String[] args)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		TrainerPersonalDTO personal = session.get(TrainerPersonalDTO.class, 1);
		
		System.out.println("Personal Details --> "+personal);
		
		System.out.println("Professional Details --> "+personal.getTrainer());
		
		session.close();
		
		factory.close();
	}
}
