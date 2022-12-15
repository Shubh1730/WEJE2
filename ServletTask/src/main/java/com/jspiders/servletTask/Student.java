package com.jspiders.servletTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -3100530421828508174L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter writer =response.getWriter();
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String contact=request.getParameter("contact");
	String course=request.getParameter("course");
	String place=request.getParameter("place");
	String gender=request.getParameter("gender");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet?user=root&password=root");
		String query= "insert into Student_Detail(name,email,contact,course,place,gender) values(?,?,?,?,?,?)";
		PreparedStatement statement =connection.prepareStatement(query);
		
		statement.setString(1,name);
		statement.setString(2,email);
		statement.setString(3,contact);
		statement.setString(4,course);
		statement.setString(5,place);
		statement.setString(6,gender);
		
		statement.executeUpdate();
		writer.println("<h1>SAVED</h1>");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	}

}
