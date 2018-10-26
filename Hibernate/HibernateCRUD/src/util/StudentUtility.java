package org.jspiders.hibernatecrud.util;

import org.jspiders.hibernatecrud.dao.StudentDAO;
import org.jspiders.hibernatecrud.dto.StudentDTO;

public class StudentUtility
{
	public static void main(String[] args)
	{
		StudentDTO dto = new StudentDTO();
		dto.setfName("Bruce");
		dto.setlName("Banner");
		dto.setMarks(78.4);
		
		StudentDAO dao = new StudentDAO();
		
		dao.insert(dto);
		//dao.read(3);
	
		//dao.update(4);
		
		//dao.delete(4);
	}
}
