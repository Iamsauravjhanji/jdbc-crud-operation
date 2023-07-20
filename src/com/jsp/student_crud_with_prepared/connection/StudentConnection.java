package com.jsp.student_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection 
	{
		public static Connection getStudentConnection()
		{
			try {
				//step-1 loads/Register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Step-2 Create Connection
				String url="jdbc:mysql://localhost:3306:jdbc-preparedstatement";
				String user="root";
				String password="Saurav@9599200409";
				
				Connection connection=DriverManager.getConnection(url,user,password);
				
				return connection;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	}
