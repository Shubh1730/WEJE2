package com.jspiders.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcInsert {
	private  static int result;
	private  static Connection con;
	private static Statement state;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			 state=con.createStatement();
			
			 result=state.executeUpdate("insert into Student values(4,'kuldeep','kuldep12@gmail.com')");
			System.out.println(result+"rows affected");
			con.close();
			state.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
