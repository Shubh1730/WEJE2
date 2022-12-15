package com.jspiders.hibernate.Manytomany.Dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.Manytomany.Dto.Customer_Dto;
import com.jspiders.hibernate.Manytomany.Dto.Product_Dto;

public class CustomerDto_ProductDto {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection()
	{
		factory=Persistence.createEntityManagerFactory("ManytoMany");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	private static void closeConnection()
	{
		if (factory != null)
		{
			factory.close();
		}
		if (manager != null)
		{
		 manager.close();	
		}
		if (transaction != null)
		{
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Transaction is commited");
			}
			
		}
	}

	public static void main(String[] args) 
	{
		try {
			
		
		openConnection();
		transaction.begin();
		
		Customer_Dto customer1= new Customer_Dto();
		customer1.setId(1);
		customer1.setName("shubham");
		customer1.setEmail("gore9445@gmail.com");
		customer1.setCont(1234512345L);
		manager.persist(customer1);
		
		Customer_Dto customer2= new Customer_Dto();
		customer2.setId(2);
		customer2.setName("vaishnavi");
		customer2.setEmail("vsg@gmail.com");
		customer2.setCont(1267612345L);
		manager.persist(customer2);
		
		Customer_Dto customer3= new Customer_Dto();
		customer3.setId(3);
		customer3.setName("sanket");
		customer3.setEmail("sanku445@gmail.com");
		customer3.setCont(123451345L);
		manager.persist(customer3);
		
		Product_Dto product1 = new Product_Dto();
		product1.setId(1);
		product1.setName("shoes");
		product1.setCategory("boot");
		product1.setPrice(222.23);
		manager.persist(product1);
		
		Product_Dto product2 = new Product_Dto();
		product2.setId(2);
		product2.setName("T-shirt");
		product2.setCategory("appreal");
		product2.setPrice(30000.00);
		manager.persist(product2);
		
		Product_Dto product3 = new Product_Dto();
		product3.setId(3);
		product3.setName("Watch");
		product3.setCategory("accsesories");
		product3.setPrice(500.50);
		manager.persist(product3);
		
		List<Product_Dto>products=Arrays.asList(product1,product2,product3);
		customer1.setProducts(products);
		customer2.setProducts(products);
		customer3.setProducts(products);
		
		List<Customer_Dto>customers=Arrays.asList(customer1,customer2,customer3);
		product1.setCustomers(customers);
		product2.setCustomers(customers);
		product3.setCustomers(customers);
		
		transaction.commit();
		
		} finally {
			closeConnection();
		}		
	}
	
}
