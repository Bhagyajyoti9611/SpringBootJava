package com.gentech.employee.services;

import java.util.List;
import java.util.Map;

import com.gentech.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployee(Long id);

	EmployeeDto updateEmployee(Long id,EmployeeDto employeeDto);
	
	EmployeeDto updateEmployeePartially(Long id, Map<String, Object> fields);
	
	EmployeeDto deleteEmployee(Long id);
	
	List<EmployeeDto> getAllEmployees();
}
