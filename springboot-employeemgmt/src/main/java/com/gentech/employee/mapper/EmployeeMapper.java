package com.gentech.employee.mapper;

import com.gentech.employee.dto.EmployeeDto;
import com.gentech.employee.entity.Employee;

public class EmployeeMapper {
	
	public static Employee mapToEmployee(EmployeeDto employeeDto)
	{
		Employee employee=new Employee(employeeDto.getId(),
				 employeeDto.getEmployeeFirstName(),
				 employeeDto.getEmployeeLastName(),
				 employeeDto.getJobName(),
				 employeeDto.getEmailId(),
				 employeeDto.getAge(),
				 employeeDto.getContactNumber(),
				 employeeDto.getSalary(),
				 employeeDto.getDepartmentName(),
				 employeeDto.getCityName(),
				 employeeDto.getAddress(),
				 employeeDto.getCreatedAt(),
				 employeeDto.getUpdatedAt());
		return employee;
	}
	
	public static EmployeeDto mapToEmployeeDto(Employee employee)
	{
		EmployeeDto employeeDto=new EmployeeDto(employee.getId(),
				employee.getEmployeeFirstName(),
				employee.getEmployeeLastName(),
				employee.getJobName(),
				employee.getEmailId(),
				employee.getAge(),
				employee.getContactNumber(),
				employee.getSalary(),
				employee.getDepartmentName(),
				employee.getCityName(),
				employee.getAddress(),
				employee.getCreatedAt(),
				employee.getUpdatedAt());
		return employeeDto;
	}

}
