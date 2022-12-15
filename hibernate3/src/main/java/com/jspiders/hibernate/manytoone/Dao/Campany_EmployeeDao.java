package com.jspiders.hibernate.manytoone.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.manytoone.Dto.CompanyDto;
import com.jspiders.hibernate.manytoone.Dto.EmployessDto;

public class Campany_EmployeeDao {
	 private static EntityManager manager;
	 private static EntityManagerFactory factory;
	 private static EntityTransaction transaction;
	 
    private static void openConnection() {
    	factory=Persistence.createEntityManagerFactory("manytoone");
    	manager=factory.createEntityManager();
    	transaction=manager.getTransaction();
    }
    private static void closeConnection() {
    	if (factory !=null) {
			factory.close();
		}
    	if (manager !=null) {
			manager.close();
		}
    	if (transaction !=null) {
			try {
				 transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is commted");
			}
		}
    }
    
    public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			CompanyDto company1 =new CompanyDto();
			company1.setId(01);
			company1.setName("TCS");
			company1.setCity("pune");
			manager.persist(company1);
			
			EmployessDto employee1=new EmployessDto();
			employee1.setId(1);
			employee1.setName("dhiraj");
			employee1.setEmail("d12@gmail.com");
			employee1.setSalary(51000.12);
			employee1.setCompany(company1);
			manager.persist(employee1);
			
			EmployessDto employee2=new EmployessDto();
			employee2.setId(2);
			employee2.setName("raj");
			employee2.setEmail("raj02@gmail.com");
			employee2.setSalary(25000.12);
			employee2.setCompany(company1);
			manager.persist(employee2);
			
		} finally {
         closeConnection();
		}
	}
}
