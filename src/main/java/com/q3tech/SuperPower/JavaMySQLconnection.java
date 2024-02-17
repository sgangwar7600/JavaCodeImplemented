package com.q3tech.SuperPower;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaMySQLconnection {

	public static void main(String[] args) {
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		java.sql.Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newtable_XL", "root", "MySQL@7600" );
				
		
		PreparedStatement ps = con.prepareStatement("insert into newtable_XL values ( '3RDJeremy' ,'3RDnewEmailAdd@again')");

		ps.executeUpdate();
		
		} 
		
		
		catch (ClassNotFoundException | SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
}
