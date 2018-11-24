package org.jsp.hibernatespringwebapp.dao;

import org.jsp.hibernatespringwebapp.dto.EmployeeDTO;

public interface EmployeeDAO 
{

	void saveEmployee(EmployeeDTO dto);

	boolean authenticateUser(String username, String password);

	EmployeeDTO getUser(String username, String password);

}
