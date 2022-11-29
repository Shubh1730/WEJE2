package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
//				open the coonection
				Connection connetion=DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
				Statement statement=connetion.createStatement();
				
				ResultSet resultset=statement.executeQuery("select * "+"from student");
				
				while (resultset.next()) {
					System.out.println(resultset.getString(1)+"||"+resultset.getString(2)+"||"+resultset.getString(3));
					
				}
				connetion.close();
				statement.close();
				resultset.close();
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
		
	}

}
