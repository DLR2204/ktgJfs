package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("The table is created");
		
	}

}
