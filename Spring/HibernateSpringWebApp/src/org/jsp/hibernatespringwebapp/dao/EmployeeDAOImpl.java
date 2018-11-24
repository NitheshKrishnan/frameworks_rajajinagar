package org.jsp.hibernatespringwebapp.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jsp.hibernatespringwebapp.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{
	@Autowired
	private SessionFactory factory;

	@Override
	public void saveEmployee(EmployeeDTO dto)
	{
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		
		tx.commit();
		
		session.close();
	}

	@Override
	public boolean authenticateUser(String username, String password) 
	{
		Session session = factory.openSession();
		
		String hql = "FROM EmployeeDTO where username = :user and password = :pswd";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("user", username);
		query.setParameter("pswd", password);
		
		EmployeeDTO dto = (EmployeeDTO)query.uniqueResult();
		
		session.close();
		
		if(dto!=null)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public EmployeeDTO getUser(String username, String password)
	{
		Session session = factory.openSession();
		
		String hql = "FROM EmployeeDTO where username = :user and password = :pswd";
		
		
		Query query = session.createQuery(hql);
		
		query.setParameter("user", username);
		query.setParameter("pswd", password);
		
		EmployeeDTO dto = (EmployeeDTO)query.uniqueResult();
		
		session.close();
		
		return dto;
	}
}