package org.jsp.hibernatespringwebapp.service;

import org.jsp.hibernatespringwebapp.dto.EmployeeDTO;

public interface EmployeeService {

	void saveEmployee(EmployeeDTO dto);

	boolean authenticateUser(String username, String password);

	EmployeeDTO getUser(String username, String password);

}
