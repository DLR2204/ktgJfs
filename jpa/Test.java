package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		Employee emp1 = new Employee(1, "apple", 100000, "india");

//		em.persist(emp);

//		em.merge(emp);

		Employee emp = em.find(Employee.class, 2);
		
		em.remove(emp);

		System.out.println(emp);

		em.getTransaction().commit();

		em.close();

		System.out.println("The table is created");

	}

}
