package com.gentech.emp.service;

import java.util.List;

import com.gentech.emp.dto.EmployeeDto;


public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeedto);
	EmployeeDto getEmployee(long id);
	EmployeeDto updateEmployee(long id,EmployeeDto employeedto);
	void deleteEmployee(long id);
	List<EmployeeDto> getAllEmployee();
	EmployeeDto getEmployeeByName(String name);
	List<EmployeeDto> getEmployeeByCityName(String name);
	EmployeeDto getEmployeeByEmail(String email);
	List<EmployeeDto> getEmployeeByAge(int age);
	List<EmployeeDto> getEmployeeBySalary(double salry);
	List<EmployeeDto> getEmployeeByJob(String job);
	List<EmployeeDto> getEmployeesByJobAndCityName(String job,String city);
	
	List<EmployeeDto> getEmployeesByJobKeyword(String keyword);

	List<EmployeeDto> getEmployeesDetailsBySalary(double salary);
	
	void deleteEmployeeById(Long id);
	List<EmployeeDto> getAllEmployeesForPagination(int pagenumber, int pagesize);
	List<EmployeeDto> getAllEmployeesWithSorting();

}
