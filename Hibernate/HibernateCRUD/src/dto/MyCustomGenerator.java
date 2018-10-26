package org.jspiders.hibernatecrud.dto;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomGenerator implements IdentifierGenerator
{

	public Serializable generate(SessionImplementor arg0, Object arg1)
	throws HibernateException
	{
		String url = "jdbc:mysql://localhost:3306/rajajinagar_db?user=nithesh&password=1234";
		String query = "select max(id) from student_info";
		int val;
		
		try(Connection con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query))
		{
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			if(rs.next())
			{
				val = rs.getInt(1);
				
				return val + 2;
			}
			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		return 2;
	}

}