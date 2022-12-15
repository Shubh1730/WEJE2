package com.jspiders.hibernate.onetomany.Dao;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.onetomany.Dto.ChildDto;
import com.jspiders.hibernate.onetomany.Dto.FatherDto;

public class Father_ChildDao {
	private static EntityManager manager;
	private static EntityManagerFactory factory;
	private static EntityTransaction transaction;
	
	private static void openConnection(){
	 factory=Persistence.createEntityManagerFactory("Onetomany");
	 manager=factory.createEntityManager();
	 transaction=manager.getTransaction();
	}
	private static void closeConnection() {
		if(factory !=null) {
			factory.close();
		}
		if (manager !=null) {
			manager.close();
		}
        if (transaction !=null) {
         try {
			transaction.rollback();
		} catch (TransactionException e) {
			System.out.println("trasaction is commited.");
		}	
        }
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			FatherDto father1=new FatherDto();
			father1.setId(1);
			father1.setName("ajit");
			father1.setAge(50);
			manager.persist(father1);
			
			ChildDto child1=new ChildDto();
			child1.setId(1);
			child1.setName("Pranav");
			child1.setAge(22);
			
			manager.persist(child1);
			
			ChildDto child2=new ChildDto();
			child2.setId(2);
			child2.setName("Aanav");
			child2.setAge(20);
			
			manager.persist(child2);
			
			ChildDto child3=new ChildDto();
			child3.setId(3);
			child3.setName("Nitya");
			child3.setAge(18);
			
			manager.persist(child3);
			
		List<ChildDto>children=Arrays.asList(child1,child2,child3);
		father1.setChildren(children);
		transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
