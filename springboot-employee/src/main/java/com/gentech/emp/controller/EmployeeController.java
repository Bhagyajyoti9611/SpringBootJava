package com.gentech.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.emp.dto.EmployeeDto;
import com.gentech.emp.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long id)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.getEmployee(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable("id") Long id,
			@RequestBody EmployeeDto employeeDto)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.updateEmployee(id, employeeDto), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<EmployeeDto> deleteById(@PathVariable("id") Long id)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.deleteEmployee(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees()
	{
		return new ResponseEntity<List<EmployeeDto>>(employeeService.getAllEmployees(), HttpStatus.OK);
	}
	
	@PatchMapping("{id}")
	public ResponseEntity<EmployeeDto> modifyEmployeePartially(@PathVariable("id") Long id,
			@RequestBody Map<String, Object> fields)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.updateEmployeePartially(id, fields), HttpStatus.OK);
	}
}
