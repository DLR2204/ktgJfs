package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Dao;
import com.entity.Employee;
@Service
public class ServiceImplementation implements Services{
	@Autowired
	Dao dao;
	
	@Override
	public String addEmp(Employee emp) {
		
		return dao.addEmp(emp);
	}

	@Override
	public String updateEmp(Employee emp) {
		
		return dao.updateEmp(emp);
	}

	@Override
	public String deleteEmp(int empId) {
		
		return dao.deleteEmp(empId);	}

	@Override
	public Employee getEmp(int empId) {
		
		return dao.getEmp(empId);
	}

}
