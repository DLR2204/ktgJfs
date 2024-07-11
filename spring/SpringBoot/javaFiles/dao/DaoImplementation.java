package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DaoImplementation implements Dao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String addEmp(Employee emp) {
		
		em.persist(emp);
		
		return "your data is inserted successfully";
	}

	@Override
	public String updateEmp(Employee emp) {
		em.merge(emp);
		
		return "your data is updated successfully";
	}

	@Override
	public String deleteEmp(int empId) {
		
		Employee emp = em.find(Employee.class,empId);
		em.remove(emp);
		
		return "your data is deleted successfully";
	}

	@Override
	public Employee getEmp(int empId) {
		
		return em.find(Employee.class,empId);
	}

}
