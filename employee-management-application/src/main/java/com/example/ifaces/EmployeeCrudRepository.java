package com.example.ifaces;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.example.entity.Employee;
import com.example.exceptions.EmployeeNotFoundException;

public interface EmployeeCrudRepository extends CrudRespository<Employee> {
	public List<Employee> getByName(String name) throws EmployeeNotFoundException;
	public Map<String,Long> getNameAndPhoneNumber() throws EmployeeNotFoundException;
	public boolean updateEmailAndPhoneNumber(String initialMail,String changedMail,long phoneNumber) throws EmployeeNotFoundException;
	public boolean deleteByName(String name) throws EmployeeNotFoundException;
	public Map<String,String> getNameAndEmail(LocalDate date)throws EmployeeNotFoundException;
	public Map<String,Long> getNameAndPhoneNumber(LocalDate date)throws EmployeeNotFoundException;
}
