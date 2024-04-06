package com.gentech.emp.mapper;


import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.entity.Employee;

public class Employeemapper {
	public static Employee mapToEmployee(EmployeeDto employeedto) {
		
		Employee employee=new Employee(employeedto.getId(),
				employeedto.getEmpName(),
				employeedto.getJobName(),
				employeedto.getEmailId(),
				employeedto.getAge(),
				employeedto.getSalary(),
				employeedto.getCityName(),
				employeedto.getCreateDate(),
				employeedto.getUpdateDate());
				return employee;
	}
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		EmployeeDto employeeDto=new EmployeeDto(employee.getId(),
				employee.getEmpName(),
				employee.getJobName(),
				employee.getEmailId(),
				employee.getAge(),
				employee.getSalary(),
				employee.getCityName(),
				employee.getCreateDate(),
				employee.getUpdateDate());
		return employeeDto;
	}

}
