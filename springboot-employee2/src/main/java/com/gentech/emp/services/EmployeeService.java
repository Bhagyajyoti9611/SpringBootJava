package com.gentech.emp.services;

import java.util.List;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.entity.Employee;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployee(Long id);

	EmployeeDto updateEmployee(Long id,EmployeeDto employeeDto);
	
	EmployeeDto deleteEmployee(Long id);
	
	List<EmployeeDto> getAllEmployees();
	
	EmployeeDto getEmployeeByName(String name);
	
	List<EmployeeDto> getEmployeesByCityName(String name);
	
	List<EmployeeDto> getEmployeesByJobAndCityName(String job,String city);
	
	List<EmployeeDto> getEmployeesByJobKeyword(String keyword);
	
	List<EmployeeDto> getEmployeesDetailsBySalary(double salary);
	
	void deleteEmployeeById(Long id);
	
	List<EmployeeDto> getAllEmployeesForPagination(int pageNumber, int pageSize);
	
	List<EmployeeDto> getAllEmployeesWithSorting();
}
