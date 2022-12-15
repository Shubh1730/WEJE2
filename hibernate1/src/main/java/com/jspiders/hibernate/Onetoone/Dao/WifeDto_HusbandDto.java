package com.jspiders.hibernate.Onetoone.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.Onetoone.Dto.HusbandDto;
import com.jspiders.hibernate.Onetoone.Dto.WifeDto;

public class WifeDto_HusbandDto {
	private static EntityManagerFactory factory;
	 private static EntityManager maneger;
	 private static EntityTransaction transaction;
	 
	 private static void openConnection() {
		 factory=Persistence.createEntityManagerFactory("Onetoone");
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
		
			WifeDto wife =new WifeDto();
			wife.setId(1);
			wife.setName("vaishu");
            wife.setEmail("vaishu@1730");
            wife.setAge(22);
            wife.setContact(9898989898L);
            
            maneger.persist(wife);
            
            HusbandDto husband =new HusbandDto();
            husband.setId(1);
			husband.setName("shubh");
            husband.setEmail("shu@1730");
            husband.setAge(23);
            husband.setContact(9898989898L);
            
            maneger.persist(husband);
            transaction.commit();
            
		} finally {
			closeConnection();
		}
	}
}


