package com.data.JPA;

/**
 * @author neelam.kapoor
 * 
 * This class inserts a sample record in Customer table in Oracle DB
 * using JPA and Hibernate 
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.data.datasource.Customer;

public class MainJPA {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainJPA.class);

	public static void main(String[] args) {
		persistEntity();		
	}
	
	static void persistEntity(){
		try{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testHibernateJPA");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			
			Customer customer = new Customer(12,"Bob", 24000, 23);
			entityManager.persist(customer);
			
			entityManager.getTransaction().commit();
			entityManager.close();
			
			entityManagerFactory.close();	
		}catch(Exception e){
			LOGGER.error("error while persisting customer", e.getMessage());			
		}		
	}	
}
