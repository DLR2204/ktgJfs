package com.service;

import com.entity.Employee;

public interface Services {
	
	public String addEmp(Employee emp);
	
	public String updateEmp(Employee emp);
	
	public String deleteEmp(int empId);
	
	public Employee getEmp(int empId);

}
