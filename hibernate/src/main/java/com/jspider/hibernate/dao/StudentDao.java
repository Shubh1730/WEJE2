package com.jspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class StudentDao {
 private static EntityManagerFactory factory;
 private static EntityManager maneger;
 private static EntityTransaction transaction;
 
 private static void openConnection() {
	 factory=Persistence.createEntityManagerFactory("Student");
	 maneger=factory.createEntityManager();
	 transaction=maneger.getTransaction();
 }
 private static void closeConnection() {
	 if(factory != null) {
		 factory.close();
	 }
	 if(maneger !=null) {
		 maneger.close();
	 }
	 try { 
		transaction.rollback();
	} catch (TransactionException e) {
		System.out.println("transaction is commited");
	}
 } 

 public static void main(String[] args) {
	try {
		openConnection();
		transaction.begin();
		
		StudentDTO student= new StudentDTO();
		student.setId(2);
		student.setName("sanket");
		student.setEmail("samket12@gmail.com");
		student.setCont(1234567890L);
		maneger.persist(student);
		
		StudentDTO student1= new StudentDTO();
		student1.setId(3);
		student1.setName("vijay");
		student1.setEmail("ijay12@gmail.com");
		student1.setCont(1654567890L);
		maneger.persist(student1);
		transaction.commit();
	} finally {
		closeConnection();
	}
}
}
