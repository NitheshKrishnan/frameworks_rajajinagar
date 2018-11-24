package org.jsp.hibernatespringwebapp.service;

import org.jsp.hibernatespringwebapp.dao.EmployeeDAO;
import org.jsp.hibernatespringwebapp.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeDAO dao;
	
	public void saveEmployee(EmployeeDTO dto) 
	{
		dao.saveEmployee(dto);
	}

	public boolean authenticateUser(String username, String password) {
		return dao.authenticateUser(username,password);
	}

	@Override
	public EmployeeDTO getUser(String username, String password) {
		return dao.getUser(username,password);
	}

}
