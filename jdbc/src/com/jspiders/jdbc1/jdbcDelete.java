package com.jspiders.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDelete 
{

		private static Connection con;
		private static Statement state;
		private static int result;
  public static void main(String[] args)
  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
		state=con.createStatement();
		result=state.executeUpdate("delete from Student where id=4");
		System.out.println(result+"rows affected");
		
	     } 
	catch (Exception e) 
	    {
	    e.printStackTrace();	
	    }
	finally 
	{
		if(con!=null)
			
	     try {
	    	 con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	  }
	if(state!=null)
		try {
			state.close();
		} catch (SQLException s) {
			System.out.println(s);
		}
	
  }
	
}
